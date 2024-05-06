package top.gongshuai.homeassistant.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Mingxi implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Test> list;

}
