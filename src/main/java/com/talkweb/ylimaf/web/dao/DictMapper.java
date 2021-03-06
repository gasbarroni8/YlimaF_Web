package com.talkweb.ylimaf.web.dao;

import com.talkweb.ylimaf.web.pojo.Dict;
import com.talkweb.ylimaf.web.pojo.DictExample;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Cacheable(value = "eternalCache", keyGenerator = "myCacheKeyGenerator")
public interface DictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict
     *
     * @mbggenerated
     */
    int insert(Dict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict
     *
     * @mbggenerated
     */
    int insertSelective(Dict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict
     *
     * @mbggenerated
     */
    List<Dict> selectByExample(DictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict
     *
     * @mbggenerated
     */
    Dict selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Dict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Dict record);
}