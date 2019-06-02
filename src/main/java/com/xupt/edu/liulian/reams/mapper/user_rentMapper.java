package com.xupt.edu.liulian.reams.mapper;

import com.xupt.edu.liulian.reams.pojo.user_rent;
import com.xupt.edu.liulian.reams.pojo.user_rentExample;
import java.util.List;

public interface user_rentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user_rent record);

    int insertSelective(user_rent record);

    List<user_rent> selectByExample(user_rentExample example);

    user_rent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user_rent record);

    int updateByPrimaryKey(user_rent record);
}