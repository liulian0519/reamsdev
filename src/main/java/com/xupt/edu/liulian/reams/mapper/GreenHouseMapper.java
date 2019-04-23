package com.xupt.edu.liulian.reams.mapper;

import com.xupt.edu.liulian.reams.pojo.GreenHouse;
import com.xupt.edu.liulian.reams.pojo.GreenHouseExample;
import java.util.List;

public interface GreenHouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GreenHouse record);

    int insertSelective(GreenHouse record);

    List<GreenHouse> selectByExample(GreenHouseExample example);

    GreenHouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GreenHouse record);

    int updateByPrimaryKey(GreenHouse record);
}