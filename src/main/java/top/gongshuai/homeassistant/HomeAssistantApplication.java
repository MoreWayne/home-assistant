package top.gongshuai.homeassistant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("top.gongshuai.homeassistant.dal.mapper")
@EnableScheduling
public class HomeAssistantApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeAssistantApplication.class, args);
    }

}
