package com.xupt.edu.liulian.reams.service.impl;

import com.xupt.edu.liulian.reams.mapper.PicMapper;
import com.xupt.edu.liulian.reams.pojo.Pic;
import com.xupt.edu.liulian.reams.pojo.PicExample;
import com.xupt.edu.liulian.reams.service.PicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class PicServiceImpl implements PicService{
    @Autowired
    PicMapper picMapper;
    @Override
    public List<Pic> list(){
        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        return picMapper.selectByExample(picExample);
    }

    @Override
    public void add(Pic pic){
        picMapper.insert(pic);
    }
    @Override
    public void update(Pic pic){
        picMapper.updateByPrimaryKeySelective(pic);
    }
}
