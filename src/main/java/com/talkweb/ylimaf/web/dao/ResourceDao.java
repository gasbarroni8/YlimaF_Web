package com.talkweb.ylimaf.web.dao;

import com.talkweb.ylimaf.web.mapper.ResourceMapper;
import com.talkweb.ylimaf.web.pojo.Resource;
import com.talkweb.ylimaf.web.pojo.ResourceExample;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ZhuXu on 2017/8/21 0021.
 */
@Repository
public class ResourceDao {

    @Autowired
    SqlSession sqlSession;

    @Cacheable(value = "eternalCache")
    public Resource selectByPrimaryKey(long id) {
        return getMapper().selectByPrimaryKey(id);
    }

    @Cacheable(value = "eternalCache")
    public List<Resource> selectByExample(ResourceExample resourceExample) {
        return getMapper().selectByExample(resourceExample);
    }

    public int insert(Resource resource) {
        return getMapper().insert(resource);
    }

    private ResourceMapper getMapper() {
        return sqlSession.getMapper(ResourceMapper.class);
    }
}
