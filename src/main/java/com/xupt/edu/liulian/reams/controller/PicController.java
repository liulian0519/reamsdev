package com.xupt.edu.liulian.reams.controller;

import com.xupt.edu.liulian.reams.pojo.Pic;
import com.xupt.edu.liulian.reams.service.PicService;
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
public class PicController {
    @Autowired
    PicService picService;
    @RequestMapping(value = "pic",method = RequestMethod.GET)
    @ResponseBody
    public List<Pic> list() throws Exception{
        List<Pic> pic = picService.list();
        return pic;
    }
   //这个接口不用，只是为了测试单张表图片上传功能的正确性
    @RequestMapping(value = "picAdd",method = RequestMethod.POST)
    @ResponseBody
    public Pic add(Pic pic, @RequestParam("uploadedImageFile") MultipartFile uploadedImageFile, HttpServletRequest request)throws IOException{
        String path = request.getServletContext().getRealPath("/upload/pics");
        //创建文件
        File dir=new File(path);
        if(!dir.exists()){
            dir.mkdirs();
        }
        String fileName=uploadedImageFile.getOriginalFilename();
        String img = pic.getGreenhouse_id()+fileName.substring(fileName.lastIndexOf("."));
        FileOutputStream imgOut = new FileOutputStream(new File(dir,img));
        imgOut.write(uploadedImageFile.getBytes());
        imgOut.close();
        Map<String,String> map = new HashMap<>();
        map.put("path",img);
        String imgurl = "http://localhost:8080/reamsdev/upload/pics/"+img;
//        System.out.println(imgurl);
//        System.out.println(path);
        pic.setImgurl(imgurl);
        picService.add(pic);
        return pic;

    }



}
