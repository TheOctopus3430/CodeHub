package com.example.userservice;

import com.example.common.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @GetMapping("/user")
    public String a(String name) {
        log.info("Hello, " + name);
        try {
            //调用订单服务
            return HttpUtils.get("http://localhost:8082/order");
        } catch (Exception e) {
            log.error("call b error", e);
        }
        return "fail";
    }
}