package com.xupt.edu.liulian.reams.mapper;

import com.xupt.edu.liulian.reams.pojo.Building;
import com.xupt.edu.liulian.reams.pojo.BuildingExample;
import java.util.List;

public interface BuildingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Building record);

    int insertSelective(Building record);

    List<Building> selectByExample(BuildingExample example);

    Building selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);
}