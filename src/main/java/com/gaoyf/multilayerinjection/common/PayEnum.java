package com.gaoyf.multilayerinjection.common;

/**
 * Created by 高宇飞 on 2019/12/10 14:45:27
 * 支付方式枚举
 */

public enum PayEnum {

    /**
     * 阿里云支付
     */
    ALI_PAY(1, "AliPay"),
    /**
     * 微信支付
     */
    WX_PAY(2, "WXPay"),
    /**
     * 银联支付
     */
    UNION_PAY(3, "UnionPay");

    private int key;
    private String value;

    PayEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * 根据类型值获取类型名称
     *
     * @param key 类型值
     * @return 类型名称
     */
    public static String getValue(int key) {
        for (PayEnum payEnum : PayEnum.values()) {
            if (payEnum.getKey() == key) {
                return payEnum.getValue();
            }
        }
        return null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
