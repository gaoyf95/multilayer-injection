package com.gaoyf.multilayerinjection.service.impl;

import com.gaoyf.multilayerinjection.service.PayService;
import org.springframework.stereotype.Service;

/**
 * Created by 高宇飞 on 2019/12/10 14:37:48
 * 支付宝支付
 */
@Service(value = "AliPay")
public class AliPayService implements PayService {
    @Override
    public String pay() {
        return "使用了支付宝支付";
    }
}
