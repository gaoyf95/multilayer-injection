package com.gaoyf.multilayerinjection.service.impl;

import com.gaoyf.multilayerinjection.service.PayService;
import org.springframework.stereotype.Service;

/**
 * Created by 高宇飞 on 2019/12/10 14:36:57
 * 微信支付
 */
@Service(value = "WXPay")
public class WXPayService implements PayService {
    @Override
    public String pay() {
        return "使用了微信支付";
    }
}
