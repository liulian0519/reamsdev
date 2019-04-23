package com.xupt.edu.liulian.reams.mapper;

import com.xupt.edu.liulian.reams.pojo.SaleOrder;
import com.xupt.edu.liulian.reams.pojo.SaleOrderExample;
import java.util.List;

public interface SaleOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SaleOrder record);

    int insertSelective(SaleOrder record);

    List<SaleOrder> selectByExample(SaleOrderExample example);

    SaleOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SaleOrder record);

    int updateByPrimaryKey(SaleOrder record);
}