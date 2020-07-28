package org.example.client.config;

import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * 自定义解码
 * response响应处理
 */
public class MyDecoder implements Decoder {
    @Override
    public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
        if (String.class.getTypeName().equals(type.getTypeName())) {
            return response.body().toString();
        }
        return null;
    }
}
