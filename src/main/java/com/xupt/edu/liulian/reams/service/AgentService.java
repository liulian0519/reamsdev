package com.xupt.edu.liulian.reams.service;

import com.xupt.edu.liulian.reams.pojo.Agent;

import java.util.List;

public interface AgentService {
    List<Agent> list();

    List<Agent> listByPhone(String phone);
    void update(Agent agent);

}
