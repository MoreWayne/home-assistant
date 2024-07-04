package top.gongshuai.homeassistant.Utils;

import top.gongshuai.homeassistant.enums.SensitiveType;

public class SensitiveInfoUtil {

    public static String mobilePhone(String mobile) {
        if (mobile == null || mobile.isEmpty()) {
            return "";
        }
        return mobile.replaceAll("(\\w{3})\\w*(\\w{4})", "$1****$2");
    }
    public static String card(String mobile) {
        if (mobile == null || mobile.isEmpty()) {
            return "";
        }
        return mobile.replaceAll("(\\w{3})\\w*(\\w{4})", "$1***********$2");
    }

    public static String sensitiveInfo(SensitiveType sensitiveType,String info){
        switch (sensitiveType){
            case MOBILE_PHONE -> {
                return mobilePhone(info);
            }
            case ID_CARD -> {
                return card(info);
            }
            default -> {
                return info;
            }
        }
    }
}
