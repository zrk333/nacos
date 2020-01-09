package com.zrk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2020/1/9
 */
@RestController
@RequestMapping("user")
@RefreshScope
public class UserController {

    @Value("${userName:123}")
    private String userName;

    @RequestMapping("/get")
    public String get() {
        return userName + " hello";
    }
}
