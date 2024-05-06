package top.gongshuai.homeassistant.dto.common;

import lombok.Data;
import org.apache.http.HttpStatus;

@Data
public class Result<T> {

    private  String code;

    private  String msg;

    private  T data;

    private Result(){}


}
