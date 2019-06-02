package com.xupt.edu.liulian.reams.controller;

import com.alibaba.fastjson.JSONObject;
import com.xupt.edu.liulian.reams.pojo.SaleOrder;
import com.xupt.edu.liulian.reams.service.SaleOrderService;
import com.xupt.edu.liulian.reams.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class SaleOrderController {
    @Autowired
    SaleOrderService saleOrderService;

    @RequestMapping(value = "saleorderAdd",method = RequestMethod.POST)
    @ResponseBody
    public SaleOrder add(SaleOrder saleOrder)throws Exception{
        saleOrderService.add(saleOrder);
        return saleOrder;
    }
}
