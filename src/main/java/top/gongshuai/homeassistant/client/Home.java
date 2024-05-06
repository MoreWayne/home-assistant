package top.gongshuai.homeassistant.client;

import com.dtflys.forest.annotation.Body;
import com.dtflys.forest.annotation.PostRequest;
import com.dtflys.forest.annotation.Retry;
import top.gongshuai.homeassistant.Utils.SecondHouse;
import top.gongshuai.homeassistant.dto.Mingxi;

public interface Home {

    @PostRequest(url = "https://zwfw.fgj.hangzhou.gov.cn/jjhygl/web/WebInfoAction_selectJjrPjList.jspx"
            , dataType = "json", connectTimeout = 10000, readTimeout = 10000)
    public Mingxi home(@Body("qycode") String qycode, @Body("page") String page);

    @PostRequest(url = "https://zwfw.fgj.hangzhou.gov.cn/jjhygl/webty/WebFyAction_getGpxxSelectList.jspx",
            dataType = "json",
            connectTimeout = 10000,
            readTimeout = 10000,
            charset = "UTF-8"
    )
    @Retry(maxRetryCount = "2")
    SecondHouse getList(@Body("page") String page, @Body("xqid") String xqid, @Body("xzqh") String xzqh, @Body("fwyt") String fwyt);

}
