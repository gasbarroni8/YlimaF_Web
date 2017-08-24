package com.talkweb.ylimaf.web.cache;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cache.interceptor.KeyGenerator;

import java.lang.reflect.Method;

/**
 * Created by zWX435453 on 2017/8/24/0024.
 */
public class MyCacheKeyGenerator implements KeyGenerator {

    public static final int NO_PARAM_KEY = 0;

    @Override
    public Object generate(Object target, Method method, Object... params) {
        StringBuilder key = new StringBuilder();
        key.append(target.getClass().getName()).append(".").append(method.getName()).append(".");
        if (params.length == 0) {
            return key.append(NO_PARAM_KEY).toString();
        }

        for (Object param : params) {
            key.append(JSONObject.toJSONString(param));
        }

        return key.toString();
    }
}
