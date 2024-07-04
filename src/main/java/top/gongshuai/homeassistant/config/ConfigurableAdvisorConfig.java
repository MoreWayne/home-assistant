package top.gongshuai.homeassistant.config;

import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.gongshuai.homeassistant.aop.SensitiveInfoInterceptor;

@Configuration
public class ConfigurableAdvisorConfig {

    @Bean("SensitiveInfoInterceptor")
    public AspectJExpressionPointcutAdvisor configSensitive(){
        AspectJExpressionPointcutAdvisor ad = new AspectJExpressionPointcutAdvisor();
        ad.setOrder(5);
        ad.setAdvice(new SensitiveInfoInterceptor());
        return ad;
    }
}
