package top.gongshuai.homeassistant.dal.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;

@Data
@TableName("t1")
public class Query {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("cyrybh")
    private String cyrybh;

    @TableField("cyryxm")
    private String cyryxm;

    @TableField("fwzl")
    private String fwzl;

    @TableField("htbasj")
    private LocalDate htbasj;

    @TableField("pjsj")
    private LocalDate pjsj;

}
