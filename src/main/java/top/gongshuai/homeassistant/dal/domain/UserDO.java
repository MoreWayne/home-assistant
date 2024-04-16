package top.gongshuai.homeassistant.dal.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("user")
public class UserDO implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.AUTO )
    private Long id;

    @TableField("user_name")
    private String username;

    @TableField("password")
    private String password;

    @TableField("user_phone")
    private String userPhone;
}
