package com.xupt.edu.liulian.reams.controller;

import com.alibaba.fastjson.JSONObject;
import com.xupt.edu.liulian.reams.pojo.Agent;
import com.xupt.edu.liulian.reams.service.AgentService;
import com.xupt.edu.liulian.reams.util.JavaSmsApi;
import com.xupt.edu.liulian.reams.util.PhoneCode;
import com.xupt.edu.liulian.reams.util.VerifyCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
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
    private static String session_vcode;
    private static String phone_code;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String Hello() {
        System.out.println("hellonjdshcbvdfjgvu");
        return "Hello World";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<Agent> list() throws Exception {
        List<Agent> agent = agentService.list();
        System.out.println(agent);
        return agent;
    }

    @RequestMapping(value = "agent/listByPhone", method = RequestMethod.POST)
    @ResponseBody
    public List<Agent> listByPhone(@RequestParam("phone") String phone) {
        List<Agent> agent = agentService.listByPhone(phone);
//        System.out.println(agent);
        System.out.println(agent.size());
        return agent;
    }

    @RequestMapping(value = "agentAdd", method = RequestMethod.POST)
    @ResponseBody
    public Agent add(Agent agent) {
        agentService.add(agent);
        return agent;
    }

    @RequestMapping(value = "agentUpdate", method = RequestMethod.POST)
    @ResponseBody
    public String update(Agent agent, @RequestParam("uploadImageFile") MultipartFile uploadedImageFile, HttpServletRequest request) throws IOException {
//        agentService.update(agent);
//        return null;
        String path = request.getServletContext().getRealPath("/upload/agent");
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String fileName = uploadedImageFile.getOriginalFilename();
        String img = agent.getId() + fileName.substring(fileName.lastIndexOf("."));
        FileOutputStream imgOut = new FileOutputStream(new File(dir, img));
        imgOut.write(uploadedImageFile.getBytes());
        imgOut.close();
        Map<String, String> map = new HashMap<String, String>();
        map.put("path", img);
        String imgurl = "http://localhost:8080/upload/agent/" + img;
        agent.setImage(imgurl);
        agent.setType(0);
        agentService.update(agent);
        String success = "ok";
        return success;
    }


    @RequestMapping(value = "verfiycode", method = RequestMethod.GET)
    @ResponseBody
    public void getVerifyCodeImage(HttpServletRequest request, HttpServletResponse response) throws IOException {

//        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        VerifyCode verifyCode = new VerifyCode();
        BufferedImage bufferedImage = verifyCode.getImage();
        session_vcode = verifyCode.getText();

        Cookie cookie = new Cookie("session_vcode", verifyCode.getText());
        response.addCookie(cookie);

//        response.addHeader("Set-Cookie",verifyCode.getText());
        VerifyCode.output(bufferedImage, response.getOutputStream());
    }

//    @RequestMapping
    @RequestMapping(value = "verfiy", method = RequestMethod.POST)
    public void getVerfiy(@RequestParam("verfiycode") String verfiycode,
                          @RequestParam("phone") String phone, HttpServletResponse response, HttpServletRequest request) throws IOException {
        response.setCharacterEncoding("utf-8");

        String text = session_vcode;
        System.out.println(text);
        System.out.println(phone);
        // 图片验证码为空
        if (text == null) {
            JSONObject object = new JSONObject();
            object.put("msg", false);
            object.put("mistake", "session没有验证码");
            response.getWriter().print(object);
            return;
        }
        //图片验证码错误时
        if (!text.equalsIgnoreCase(verfiycode)) {
            JSONObject object = new JSONObject();
            object.put("msg", false);
            object.put("mistake", "图片验证码输入有误");
            response.getWriter().print(object);
            return;
        }
        // 图片验证码正确，发短信
        JSONObject object = new JSONObject();
        object.put("msg", true);
        response.getWriter().print(object);
        PhoneCode code = new PhoneCode();
//        String phone_code = code.getCode();
//        request.getSession().setAttribute("phone_code", phone_code);//将文本存入session中
        phone_code = code.getCode();
        JavaSmsApi.sendSms("48809fdf8978aee119b70a4143471973", "【创享实验室】您的验证码是" + phone_code + "。如非本人操作，请忽略本短信", phone);
        response.getWriter().close();//关闭输出流

    }

    @RequestMapping(value = "login")
    @ResponseBody
    public void login(@RequestParam("phone") String phone,
                      @RequestParam("code") String code, HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (phone_code == null) {
            JSONObject object = new JSONObject();
            object.put("msg", 0);//0代表错误
            object.put("mistake", "can't find phoneCode");
            response.getWriter().print(object);
            return;
        }
        if (!phone_code.equalsIgnoreCase(code)) {
            JSONObject object = new JSONObject();
            object.put("msg", 0);//0代表错误
            object.put("mistake", "phoneCode has some mistakes");
            response.getWriter().print(object);
            return;
        }
        if (phone_code.equalsIgnoreCase(code)) {
            List<Agent> agent = agentService.listByPhone(phone);
            Agent agent1 = new Agent();
            if (agent.size() == 0) {
//            将信息插入数据库中
                agent1.setPhone(phone);
                agent1.setName("test");
                agent1.setIntroduce("");
                agent1.setType(0);
                agent1.setImage("../img/person.png");
                agentService.add(agent1);
                response.setHeader(" Access-Control-Allow-Origin", "http://127.0.0.1:5500");
                response.setHeader("Access-Control-Allow-Credentials", "true");
                response.addHeader("Set-Cookie", "phone="+ phone);

                JSONObject object = new JSONObject();
                object.put("msg", true);
                response.getWriter().print(object);
                response.getWriter().close();//关闭输出流
//                object.put("mistake", "can't find phoneCode");
            } else {
                response.setHeader(" Access-Control-Allow-Origin", "http://127.0.0.1:5500");
                response.setHeader("Access-Control-Allow-Credentials", "true");
                response.addHeader("Set-Cookie", "phone="+ phone);

                JSONObject object = new JSONObject();
                object.put("msg", true);
                response.getWriter().print(object);
                response.getWriter().close();//关闭输出流
            }
        }


    }
}
