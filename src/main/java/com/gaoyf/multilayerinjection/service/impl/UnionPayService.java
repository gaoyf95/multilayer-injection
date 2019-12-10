package com.gaoyf.multilayerinjection.service.impl;

import com.gaoyf.multilayerinjection.service.PayService;
import org.springframework.stereotype.Service;

/**
 * Created by 高宇飞 on 2019/12/10 14:40:12
 * 银联支付
 */
@Service(value = "UnionPay")
public class UnionPayService implements PayService {
    @Override
    public String pay() {
        return "使用了银联支付";
    }
}
