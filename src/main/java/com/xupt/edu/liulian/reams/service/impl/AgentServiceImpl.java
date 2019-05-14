package com.xupt.edu.liulian.reams.service.impl;

import com.xupt.edu.liulian.reams.mapper.AgentMapper;
import com.xupt.edu.liulian.reams.pojo.Agent;
import com.xupt.edu.liulian.reams.pojo.AgentExample;
import com.xupt.edu.liulian.reams.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentServiceImpl implements AgentService {
    @Autowired
    AgentMapper agentMapper;

    @Override
    public List<Agent> list(){
        AgentExample agentExample = new AgentExample();
        agentExample.setOrderByClause("id asc");
        System.out.println(agentExample);
        return agentMapper.selectByExample(agentExample);
    }

    @Override
    public List<Agent> listByPhone(String phone){
        AgentExample agentExample = new AgentExample();
        agentExample.createCriteria().andPhoneEqualTo(phone);
        return agentMapper.selectByExample(agentExample);
    }
    @Override
    public void update(Agent agent){
        agentMapper.updateByPrimaryKeySelective(agent);
    }
    @Override
    public void add(Agent agent){
        agentMapper.insert(agent);
    }
//    @Override
//    public Agent listbyphone(String phone){
//        AgentExample agentExample = new AgentExample();
//        agentExample.createCriteria().andPhoneEqualTo(phone);
//        return agentMapper.selectByExample()
//    }
//    @Override
//    public List<Agent> login(String phone,String code){
//
//    }

}
