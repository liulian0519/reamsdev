package com.xupt.edu.liulian.reams.controller;

import com.xupt.edu.liulian.reams.pojo.PreOrder;
import com.xupt.edu.liulian.reams.service.PreOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

}
