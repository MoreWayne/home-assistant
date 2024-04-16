package top.gongshuai.homeassistant.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.gongshuai.homeassistant.dto.UserAddRequest;

@RestController("/user")
public class UserController {

    @PostMapping("/register")
    public void register(@RequestBody @Validated UserAddRequest user) {
        System.out.println(user.toString());
    }
}
