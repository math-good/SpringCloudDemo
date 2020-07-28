package org.example.client.config;

import feign.RequestTemplate;
import feign.codec.EncodeException;
import feign.codec.Encoder;

import java.lang.reflect.Type;

/**
 * 自定义解码
 * request请求数据处理
 */
public class MyEncoder implements Encoder {
    @Override
    public void encode(Object o, Type type, RequestTemplate requestTemplate) throws EncodeException {
        System.out.println("encode 请求地址：" + requestTemplate.url());
    }
}
