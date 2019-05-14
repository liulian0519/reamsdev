package com.xupt.edu.liulian.reams.service;

import com.xupt.edu.liulian.reams.pojo.Agent;
import com.xupt.edu.liulian.reams.util.VerifyCode;

import java.util.List;

public interface AgentService {
    List<Agent> list();

    List<Agent> listByPhone(String phone);
    void update(Agent agent);
    void add(Agent agent);
//    Agent listbyphone(String phone);


//    List<Agent> login(String phone,String code);


}
