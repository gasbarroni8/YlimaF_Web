package com.talkweb.ylimaf.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.talkweb.ylimaf.web.context.UserContext;
import com.talkweb.ylimaf.web.pojo.User;

/**
 * Created by ZhuXu on 2016/10/18 0018.
 */
@RestController
public class IndexController {

    public static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = {"/", "/index"})
    public ModelAndView index() {

        User user = UserContext.getUser();
        if (user == null) {
            return new ModelAndView("login");
        }

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
