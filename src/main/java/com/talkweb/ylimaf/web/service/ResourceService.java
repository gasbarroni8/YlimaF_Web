package com.talkweb.ylimaf.web.service;

import com.talkweb.ylimaf.web.dao.ResourceMapper;
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

    public static final String RESOURCE_TYPE = "Resource Type";

    @Autowired
    ResourceMapper resourceMapper;

    @Autowired
    DictItemService dictItemService;

    public List<Resource> queryResource(String resourceName) {

        ResourceExample resourceExample = new ResourceExample();

        if (ValidateUtil.isNotEmptyString(resourceName)) {
            resourceName = new StringBuilder().append("%").append(resourceName).append("%").toString();
            resourceExample.createCriteria().andNameLike(resourceName);
        }

        List<Resource> resourceList = resourceMapper.selectByExample(resourceExample);

        if (ValidateUtil.isNotEmptyCollection(resourceList)) {
            resourceList.forEach(resource -> formatResourceType(resource));
        }

        return resourceList;
    }

    public Resource getResource(long id) {
        Resource resource = resourceMapper.selectByPrimaryKey(id);
        formatResourceType(resource);
        return resource;
    }

    public void formatResourceType(Resource resource) {
        String type = resource.getType();
        String typeDesc = dictItemService.getDictItemDesc(RESOURCE_TYPE, type);
        resource.setType(typeDesc);
    }

}
