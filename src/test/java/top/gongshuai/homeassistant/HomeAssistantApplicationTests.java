package top.gongshuai.homeassistant;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.gongshuai.homeassistant.Utils.BeanUtils;
import top.gongshuai.homeassistant.Utils.House;
import top.gongshuai.homeassistant.Utils.SecondHouse;
import top.gongshuai.homeassistant.client.Home;
import top.gongshuai.homeassistant.dal.domain.Query;
import top.gongshuai.homeassistant.dto.Mingxi;
import top.gongshuai.homeassistant.service.HouseService;
import top.gongshuai.homeassistant.service.QueryService;

import java.util.List;

@SpringBootTest
@Slf4j
class HomeAssistantApplicationTests {

    @Resource
    private Home home;

    @Resource
    private QueryService queryService;

    @Resource
    private HouseService houseService;

    @Test
    void contextLoads() throws InterruptedException, JsonProcessingException {
        for (int i = 20; i < 100; i++) {
            Mingxi mingxi = home.home("62002058", String.valueOf(i));

            Thread.sleep(1000);
            List<Query> queries = BeanUtils.copyBeanList(mingxi.getList(), Query.class);
            queryService.saveBatch(queries);
        }
    }

    @Test
    void test() throws InterruptedException, JsonProcessingException {
        for (int i = 6; i < 4452; i++) {
            SecondHouse list = home.getList(String.valueOf(i), "0", "330181", "10");

            Thread.sleep(10000);
            List<House> queries = BeanUtils.copyBeanList(list.getList(), House.class);
            log.info("数据" + queries.toString());
            houseService.saveBatch(queries);
        }
    }

}
