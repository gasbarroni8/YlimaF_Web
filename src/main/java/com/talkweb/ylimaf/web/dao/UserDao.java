package com.talkweb.ylimaf.web.dao;

import com.talkweb.ylimaf.web.mapper.UserMapper;
import com.talkweb.ylimaf.web.pojo.User;
import com.talkweb.ylimaf.web.pojo.UserExample;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhuXu on 2016/11/18 0018.
 */
@Repository
public class UserDao {

    @Autowired
    SqlSession sqlSession;

    public User selectByPrimaryKey(int userId) {
        return getMapper().selectByPrimaryKey(userId);
    }

    public List<User> selectByExample(UserExample userExample) {
        return getMapper().selectByExample(userExample);
    }
    
    public int insert(User user) {
    	return getMapper().insert(user);
    }

    private UserMapper getMapper() {
        return sqlSession.getMapper(UserMapper.class);
    }


}
