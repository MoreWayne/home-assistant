package top.gongshuai.homeassistant.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.gongshuai.homeassistant.dto.common.Result;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e) {
        return Result.createSuccessResult("200","2","ss");
    }
}
