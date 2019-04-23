package com.xupt.edu.liulian.reams.mapper;

import com.xupt.edu.liulian.reams.pojo.NewHouse;
import com.xupt.edu.liulian.reams.pojo.NewHouseExample;
import java.util.List;

public interface NewHouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewHouse record);

    int insertSelective(NewHouse record);

    List<NewHouse> selectByExample(NewHouseExample example);

    NewHouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewHouse record);

    int updateByPrimaryKey(NewHouse record);
}