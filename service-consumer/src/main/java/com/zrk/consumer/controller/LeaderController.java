package com.zrk.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2020/1/8
 */
@RestController
@RequestMapping()
public class LeaderController {

    @Resource(name = "restTemplate")
    private RestTemplate restTemplate;

    @RequestMapping("sayHello")
    public String sayHello(@RequestParam("userName") String userName){
        return restTemplate.getForObject("http://service-provider/user/sayHello?userName=" + userName, String.class);
    }
}
