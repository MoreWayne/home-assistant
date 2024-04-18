package top.gongshuai.homeassistant.dto.common;

import lombok.Data;
import org.apache.http.HttpStatus;

@Data
public class Result<T> {

    private  String code;

    private  String msg;

    private  T data;

    private Result(){}

    public static   Result<T> createSuccessResult(String code, String msg, T data) {
        Result<T> result = new Result<>();
        result.setCode(String.valueOf(HttpStatus.SC_OK));
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

}
