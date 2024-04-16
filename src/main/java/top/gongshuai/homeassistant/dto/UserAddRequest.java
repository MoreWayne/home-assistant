package top.gongshuai.homeassistant.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Valid
public class UserAddRequest implements Serializable {
    @Serial
    private   static final long serialVersionUID = 1L;

    @NotBlank(message = "用户名不能为空")
    private String userName;

    @NotBlank(message = "密码不能为空")
    private String password;
}
