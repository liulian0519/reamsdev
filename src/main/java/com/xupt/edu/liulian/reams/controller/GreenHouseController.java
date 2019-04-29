package com.xupt.edu.liulian.reams.controller;

import com.alibaba.fastjson.JSONObject;
import com.xupt.edu.liulian.reams.dto.Green;
import com.xupt.edu.liulian.reams.dto.House;
import com.xupt.edu.liulian.reams.pojo.Community;
import com.xupt.edu.liulian.reams.pojo.GreenHouse;
import com.xupt.edu.liulian.reams.pojo.Pic;
import com.xupt.edu.liulian.reams.service.CommunityService;
import com.xupt.edu.liulian.reams.service.GreenHouseService;
import com.xupt.edu.liulian.reams.service.PicService;
import com.xupt.edu.liulian.reams.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class GreenHouseController {
    @Autowired
    GreenHouseService greenHouseService;
    @Autowired
    PicService picService;
    @Autowired
    CommunityService communityService;

    @RequestMapping(value = "list" ,method = RequestMethod.GET)
    @ResponseBody
    public House list() {
        House list = greenHouseService.list();
        return list;
    }

    @RequestMapping(value = "greenHouseById",method = RequestMethod.POST)
    @ResponseBody
    public Green selectByID(Integer green_id){
        Green green = greenHouseService.selectByID(green_id);
        return green;
    }

    @RequestMapping(value = "greenHouseAdd",method = RequestMethod.POST)
    @ResponseBody
    public GreenHouse add(GreenHouse greenHouse, Community community, Pic pic, @RequestParam("uploadedImageFile") MultipartFile uploadedImageFile, HttpServletRequest request) throws IOException{
        System.out.println("hello liulian");
        String path = request.getServletContext().getRealPath("/upload/green");
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdirs();
        }
        communityService.add(community);

        greenHouse.setCommunity_id(community.getId());
        greenHouseService.add(greenHouse);



        String fileName = uploadedImageFile.getOriginalFilename();
        String img = pic.getGreenhouse_id() + fileName.substring(fileName.lastIndexOf("."));
        FileOutputStream imgOut = new FileOutputStream(new File(dir,img));
        imgOut.write(uploadedImageFile.getBytes());
        imgOut.close();
        Map<String,String> map = new HashMap<String,String>();
        map.put("path",img);
        String imgurl = "http://localhost:8080/upload/green/"+ img;
        System.out.println(imgurl);
        pic.setImgurl(imgurl);
        pic.setGreenhouse_id(greenHouse.getId());
        pic.setType(1);
        picService.add(pic);

        return greenHouse;
    }

}

