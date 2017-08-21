package com.talkweb.ylimaf.web.service;

import com.talkweb.ylimaf.web.dao.ResourceDao;
import com.talkweb.ylimaf.web.pojo.Resource;
import com.talkweb.ylimaf.web.pojo.ResourceExample;
import com.talkweb.ylimaf.web.util.ValidateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhuXu on 2017/8/21 0021.
 */
@Service
public class ResourceService {

    public static final Logger LOG = LoggerFactory.getLogger(ResourceService.class);

    @Autowired
    ResourceDao resourceDao;

    public List<Resource> queryResource(String resourceName) {

        ResourceExample resourceExample = new ResourceExample();

        if (ValidateUtil.isNotEmptyString(resourceName)) {
            resourceName = new StringBuilder().append("%").append(resourceName).append("%").toString();
            resourceExample.createCriteria().andNameLike(resourceName);
        }

        return resourceDao.selectByExample(resourceExample);
    }

}
