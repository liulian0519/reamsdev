package com.xupt.edu.liulian.reams.mapper;

import com.xupt.edu.liulian.reams.pojo.Pic;
import com.xupt.edu.liulian.reams.pojo.PicExample;
import java.util.List;

public interface PicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pic record);

    int insertSelective(Pic record);

    List<Pic> selectByExample(PicExample example);

    Pic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pic record);

    int updateByPrimaryKey(Pic record);
}