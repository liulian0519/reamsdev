package com.xupt.edu.liulian.reams.controller;

import com.xupt.edu.liulian.reams.pojo.Pic;
import com.xupt.edu.liulian.reams.service.PicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PicController {
    @Autowired
    PicService picService;
    @RequestMapping(value = "pic",method = RequestMethod.GET)
    @ResponseBody
    public List<Pic> list() throws Exception{
        List<Pic> pic = picService.list();
        return pic;
    }
}
