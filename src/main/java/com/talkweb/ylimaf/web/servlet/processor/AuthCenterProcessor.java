package com.talkweb.ylimaf.web.servlet.processor;

import com.talkweb.ylimaf.web.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ZhuXu on 2016/11/18 0018.
 */
public abstract class AuthCenterProcessor {
    public abstract User authenticate(HttpServletRequest request, HttpServletResponse responsee);
}
