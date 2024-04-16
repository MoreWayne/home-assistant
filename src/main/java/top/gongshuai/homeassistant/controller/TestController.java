package top.gongshuai.homeassistant.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.gongshuai.homeassistant.dal.mapper.UserMapper;

@RestController
public class TestController {
    @Resource
    private UserMapper userMapper;

    @GetMapping("/test")
    public String test() {
        userMapper.selectList(null).forEach(System.out::println);
        return "hello";
    }
}
