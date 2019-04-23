package com.xupt.edu.liulian.reams.mapper;

import com.xupt.edu.liulian.reams.pojo.HouseType;
import com.xupt.edu.liulian.reams.pojo.HouseTypeExample;
import java.util.List;

public interface HouseTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseType record);

    int insertSelective(HouseType record);

    List<HouseType> selectByExample(HouseTypeExample example);

    HouseType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseType record);

    int updateByPrimaryKey(HouseType record);
}