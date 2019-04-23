package com.xupt.edu.liulian.reams.mapper;

import com.xupt.edu.liulian.reams.pojo.PreOrder;
import com.xupt.edu.liulian.reams.pojo.PreOrderExample;
import java.util.List;

public interface PreOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PreOrder record);

    int insertSelective(PreOrder record);

    List<PreOrder> selectByExample(PreOrderExample example);

    PreOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PreOrder record);

    int updateByPrimaryKey(PreOrder record);
}