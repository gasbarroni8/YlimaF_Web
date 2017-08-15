package com.talkweb.ylimaf.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.talkweb.ylimaf.web.pojo.User;
import com.talkweb.ylimaf.web.service.UserService;
import com.talkweb.ylimaf.web.util.Result;

/**
 * Created by ZhuXu on 2016/10/18 0018.
 */
@RestController
public class LoginController {

    public static final Logger LOG = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(User user) {

        Result result = userService.login(user);

        if (!result.isSuccess()) {
            return new ModelAndView("login").addObject("message", result.getMessage());
        }

        return new ModelAndView("redirect:/index").addObject("user", result.get("user"));
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView register(User user, String confirmPass) {
    	Result result = userService.register(user, confirmPass);
    	
    	if (!result.isSuccess()) {
            return new ModelAndView("login").addObject("message", result.getMessage());
        }

        return new ModelAndView("redirect:/index").addObject("user", result.get("user"));
    }
}
