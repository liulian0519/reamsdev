package com.xupt.edu.liulian.reams.mapper;

import com.xupt.edu.liulian.reams.pojo.Agent;
import com.xupt.edu.liulian.reams.pojo.AgentExample;
import java.util.List;

public interface AgentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Agent record);

    int insertSelective(Agent record);

    List<Agent> selectByExample(AgentExample example);

    Agent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Agent record);

    int updateByPrimaryKey(Agent record);
}