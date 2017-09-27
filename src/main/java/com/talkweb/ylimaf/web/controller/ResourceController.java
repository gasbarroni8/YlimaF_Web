package com.talkweb.ylimaf.web.controller;

import com.talkweb.ylimaf.web.pojo.Resource;
import com.talkweb.ylimaf.web.service.ResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by ZhuXu on 2017/8/21 0021.
 */
@RestController
@RequestMapping(value = "/resource")
public class ResourceController {

    public static final Logger LOG = LoggerFactory.getLogger(ResourceController.class);

    @Autowired
    ResourceService resourceService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        return new ModelAndView("resource");
    }

    @RequestMapping(value = "/query")
    public Object queryResource(String resourceName) {
        List<Resource> resourceList = resourceService.queryResource(resourceName);
        return resourceList;
    }

}
