package com.example.orderservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public String order() {
        log.info("start order...");
        orderService.sendMsgBySpring();
        orderService.sendMsgByThreadPool();
        return "success";
    }
}
