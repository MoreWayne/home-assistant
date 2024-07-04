package top.gongshuai.homeassistant.annotation;

import top.gongshuai.homeassistant.enums.SensitiveType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.TYPE})
public @interface Sensitive {
    SensitiveType  value() default SensitiveType.MOBILE_PHONE;

}
