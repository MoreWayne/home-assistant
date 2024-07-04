package top.gongshuai.homeassistant.dto.common;

import lombok.Data;
import org.apache.http.HttpStatus;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private String code;

    private String msg;

    private Boolean success;

    private T data;

    private Object extraData;

    private Result() {
    }

    public static <T> Result<T> createSuccessResult(T data) {
        Result<T> res = new Result<>();
        res.setSuccess(true);
        res.setCode("200");
        res.setData(data);
        return res;
    }
    public static <T> Result<T> createSuccessResult( ) {
        Result<T> res = new Result<>();
        res.setSuccess(true);
        res.setCode("200");
        return res;
    }


}
