package com.zrk.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2020/1/8
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("sayHello")
    public String sayHello(@RequestParam("userName") String userName){
        log.info(userName + ",hello nacos");
        return userName + ",hello nacos";
    }
}
