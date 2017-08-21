import com.alibaba.fastjson.JSONObject;
import com.talkweb.ylimaf.web.pojo.Resource;
import com.talkweb.ylimaf.web.service.ResourceService;
import net.sf.ehcache.Ehcache;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.ehcache.EhCacheCacheManager;

import java.util.List;

/**
 * Created by ZhuXu on 2017/8/21 0021.
 */


public class ResourceControllerTest extends AbstractJunit {

    public static final Logger LOG = LoggerFactory.getLogger(ResourceControllerTest.class);

    @Autowired
    ResourceService resourceService;

    @Autowired
    EhCacheCacheManager cacheManager;

    @Test
    public void queryResource() throws Exception {
        String resourceName = "你";
        List<Resource> resourceList = resourceService.queryResource(resourceName);
        LOG.info(JSONObject.toJSONString(resourceList));

        LOG.info(JSONObject.toJSONString(resourceService.getResource(1)));
        LOG.info(JSONObject.toJSONString(resourceService.getResource(1)));


        Cache cache = cacheManager.getCache("eternalCache");
        Ehcache ehcache = (Ehcache) cache.getNativeCache();
        List keyList = ehcache.getKeys();

        LOG.info(JSONObject.toJSONString(keyList));




    }

}