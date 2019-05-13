package com.xupt.edu.liulian.reams.controller;

import com.xupt.edu.liulian.reams.pojo.Agent;
import com.xupt.edu.liulian.reams.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AgentController {
    @Autowired
    AgentService agentService;


    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String Hello(){
        System.out.println("hellonjdshcbvdfjgvu");
        return "Hello World";
    }
    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public List<Agent> list() throws Exception{
        List<Agent> agent = agentService.list();
        System.out.println(agent);
        return agent;
    }
    @RequestMapping(value = "agent/listByPhone",method = RequestMethod.POST)
    @ResponseBody
    public List<Agent> listByPhone(@RequestParam("phone") String phone){
        List<Agent> agent = agentService.listByPhone(phone);
        return agent;
    }
    @RequestMapping(value = "agentUpdate",method = RequestMethod.POST)
    @ResponseBody
    public String update(Agent agent, @RequestParam("uploadImageFile")MultipartFile uploadedImageFile, HttpServletRequest request)throws IOException {
//        agentService.update(agent);
//        return null;
        String path = request.getServletContext().getRealPath("/upload/agent");
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdirs();
        }
        String fileName = uploadedImageFile.getOriginalFilename();
        String img = agent.getId() + fileName.substring(fileName.lastIndexOf("."));
        FileOutputStream imgOut = new FileOutputStream(new File(dir,img));
        imgOut.write(uploadedImageFile.getBytes());
        imgOut.close();
        Map<String,String> map = new HashMap<String,String>();
        map.put("path",img);
        String imgurl = "http://localhost:8080/upload/agent/"+ img;
        agent.setImage(imgurl);
        agent.setType(0);
        agentService.update(agent);
        String success = "ok";
        return success;
    }


//    //文件只能用POST方式进行传递
//    @RequestMapping(value = "agentList" ,method = RequestMethod.POST)
//    //JSON形式返回给结果
//    @ResponseBody
}
