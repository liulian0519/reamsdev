package com.xupt.edu.liulian.reams.controller;

import com.xupt.edu.liulian.reams.pojo.Agent;
import com.xupt.edu.liulian.reams.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AgentController {
    @Autowired
    AgentService agentService;


    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String Hello(){
        System.out.println("hellonjdshcbvdfjgvu");
        return "Hello World";
    }
    @RequestMapping(value = "agentList",method = RequestMethod.GET)
    @ResponseBody
    public List<Agent> list() throws Exception{
        List<Agent> agent = agentService.list();
        System.out.println(agent);
        return agent;
    }

//    //文件只能用POST方式进行传递
//    @RequestMapping(value = "agentList" ,method = RequestMethod.POST)
//    //JSON形式返回给结果
//    @ResponseBody
}
