package com.xupt.edu.liulian.reams.controller;

import com.alibaba.fastjson.JSONObject;
import com.xupt.edu.liulian.reams.pojo.PreOrder;
import com.xupt.edu.liulian.reams.service.PreOrderService;
import com.xupt.edu.liulian.reams.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class PreOrderController {
    @Autowired
    PreOrderService preOrderService;

    @RequestMapping(value = "preorderAdd",method = RequestMethod.POST)
    @ResponseBody
    public PreOrder add(PreOrder preOrder, HttpServletResponse response)throws Exception{
        preOrderService.add(preOrder);
        return preOrder;
    }
    @RequestMapping(value = "preorderDelete",method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestParam("id") Integer id,HttpServletResponse response) throws Exception{
        preOrderService.delete(id);
        JSONObject  result=new JSONObject();
        result.put("success","ok");
        ResponseUtil.write(response,result);
        return null;
    }
    @RequestMapping(value = "preorderUpdate",method = RequestMethod.POST)
    @ResponseBody
    public PreOrder update(PreOrder preOrder){
        preOrderService.update(preOrder);
        return preOrder;
    }


}
