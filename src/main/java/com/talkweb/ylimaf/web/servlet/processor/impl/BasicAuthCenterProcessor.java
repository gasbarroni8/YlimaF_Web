package com.talkweb.ylimaf.web.servlet.processor.impl;

import com.talkweb.ylimaf.web.pojo.User;
import com.talkweb.ylimaf.web.servlet.processor.AuthCenterProcessor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * BASIC验证方式
 * Created by ZhuXu on 2016/11/17 0017.
 */

public class BasicAuthCenterProcessor extends AuthCenterProcessor {
    @Override
    public User authenticate(HttpServletRequest request, HttpServletResponse responsee) {
        return null;
    }
}
