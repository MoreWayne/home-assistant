package top.gongshuai.homeassistant.Utils;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t2")
public class House implements Serializable {

    private static final long serialVersionUID = 1L;

    /*
    *
    *  "wtcsjg": 260,
          "tygpbh": "45298966174",
          "gpid": 731960845,
          "cqmc": "萧山区",
          "xzqh": 330181,
          "xqmc": "都会艺境",
          "cjsj": "2024-04-22",
          "gpfyid": 4529896,
          "jzmj": 89.31,
          "fwtybh": "230907NS996561",
          "scgpshsj": "2024-04-25",
          "mdmc": "自主挂牌",
          "gplxrxm": "周煌烽"
    *
    *
    * */
    //委托价格
    private int wtcsjg;

    //
    private String tygpbh;

    private long gpid;

    //城区名称
    private String cqmc;

    private long xzqh;

    // 小区名称
    private String xqmc;

    private String cjsj;

    private long gpfyid;

    private double jzmj;

    //  房屋统一编号
    private String fwtybh;

    private String scgpshsj;

    private String mdmc;

    //挂牌联系人姓名
    private String gplxrxm;
}
