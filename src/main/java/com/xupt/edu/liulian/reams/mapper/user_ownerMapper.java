package com.xupt.edu.liulian.reams.mapper;

import com.xupt.edu.liulian.reams.pojo.user_owner;
import com.xupt.edu.liulian.reams.pojo.user_ownerExample;
import java.util.List;

public interface user_ownerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user_owner record);

    int insertSelective(user_owner record);

    List<user_owner> selectByExample(user_ownerExample example);

    user_owner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user_owner record);

    int updateByPrimaryKey(user_owner record);
}