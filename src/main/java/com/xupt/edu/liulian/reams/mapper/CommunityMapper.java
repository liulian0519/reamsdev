package com.xupt.edu.liulian.reams.mapper;

import com.xupt.edu.liulian.reams.pojo.Community;
import com.xupt.edu.liulian.reams.pojo.CommunityExample;
import java.util.List;

public interface CommunityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Community record);

    int insertSelective(Community record);

    List<Community> selectByExample(CommunityExample example);

    Community selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);
}