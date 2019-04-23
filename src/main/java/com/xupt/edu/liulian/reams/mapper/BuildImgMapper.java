package com.xupt.edu.liulian.reams.mapper;

import com.xupt.edu.liulian.reams.pojo.BuildImg;
import com.xupt.edu.liulian.reams.pojo.BuildImgExample;
import java.util.List;

public interface BuildImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BuildImg record);

    int insertSelective(BuildImg record);

    List<BuildImg> selectByExample(BuildImgExample example);

    BuildImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BuildImg record);

    int updateByPrimaryKey(BuildImg record);
}