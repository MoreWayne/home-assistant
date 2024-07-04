package top.gongshuai.homeassistant.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.gongshuai.homeassistant.Utils.SensitiveInfoUtil;
import top.gongshuai.homeassistant.annotation.Sensitive;
import top.gongshuai.homeassistant.dto.common.Result;

import java.lang.reflect.Field;

public class SensitiveInfoInterceptor implements MethodInterceptor {
    @Nullable
    @Override
    public Object invoke(@NotNull MethodInvocation invocation) throws Throwable {
        Object proceed = invocation.proceed();
        if(proceed instanceof Result<?>){
            handleSensitiveInfo(((Result<?>)proceed));
            return proceed;
        }
        return proceed;
    }

    public void handleSensitiveInfo(Object result){
        if(result instanceof Iterable<?>){
            ((Iterable<?>)result).forEach(this::SensitiveInfo);
        }else{
            this.handleSensitiveInfo(result);
        }

    }
    public void SensitiveInfo(Object result){
        if(result==null){
            return;
        }
        Sensitive annotation = result.getClass().getAnnotation(Sensitive.class);
        if(annotation==null){
            return ;
        }
        Field[] declaredFields = result.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Sensitive annotation1 = declaredField.getAnnotation(Sensitive.class);
            if(annotation1!=null){
                declaredField.setAccessible(true);
                try{
                    Object o = declaredField.get(result);
                    if(o instanceof String){
                        String newValue = SensitiveInfoUtil.sensitiveInfo(annotation1.value(), o.toString());
                        declaredField.set(result,newValue);
                    }
                }catch(IllegalAccessException e){
                    //
                }
            }



        }
    }
}
