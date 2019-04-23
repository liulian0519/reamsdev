package com.xupt.edu.liulian.reams.mapper;

import com.xupt.edu.liulian.reams.pojo.RentHouse;
import com.xupt.edu.liulian.reams.pojo.RentHouseExample;
import java.util.List;

public interface RentHouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RentHouse record);

    int insertSelective(RentHouse record);

    List<RentHouse> selectByExample(RentHouseExample example);

    RentHouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RentHouse record);

    int updateByPrimaryKey(RentHouse record);
}