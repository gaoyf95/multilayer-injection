package com.gaoyf.multilayerinjection.controller;

import com.gaoyf.multilayerinjection.common.PayEnum;
import com.gaoyf.multilayerinjection.entity.Student;
import com.gaoyf.multilayerinjection.entity.Teacher;
import com.gaoyf.multilayerinjection.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 高宇飞 on 2019/12/10 14:42:38
 */
@RestController
@RequestMapping("/")
public class PayController {

    @Autowired
    Map<String, PayService> payServiceMap = new HashMap<>();
    @Autowired
    ApplicationContext context;

    @GetMapping("/pay/{type}")
    public String pay(@PathVariable int type) {
        //发布学生事件
        context.publishEvent(new Student(1, "学生111"));
        return getPayService(type).pay();
    }

    @GetMapping("/pay2/{type}")
    public String pay2(@PathVariable int type) {
        //发布老师事件
        context.publishEvent(new Teacher(1, "老师111"));
        return getPayService(type).pay();
    }


    private PayService getPayService(int type) {
        return payServiceMap.get(PayEnum.getValue(type));
    }

}
