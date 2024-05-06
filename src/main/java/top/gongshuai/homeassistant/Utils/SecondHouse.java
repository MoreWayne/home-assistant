package top.gongshuai.homeassistant.Utils;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SecondHouse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String pageinfo;

    private Integer totaltows;

    private List<House> list;

}
