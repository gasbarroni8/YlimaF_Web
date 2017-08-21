import com.alibaba.fastjson.JSONObject;
import com.talkweb.ylimaf.web.pojo.Resource;
import com.talkweb.ylimaf.web.service.ResourceService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ZhuXu on 2017/8/21 0021.
 */


public class ResourceControllerTest extends AbstractJunit {

    public static final Logger LOG = LoggerFactory.getLogger(ResourceControllerTest.class);

    @Autowired
    ResourceService resourceService;

    @Test
    public void queryResource() throws Exception {
        String resourceName = "你";
        List<Resource> resourceList = resourceService.queryResource(resourceName);

        LOG.info(JSONObject.toJSONString(resourceList));


    }

}