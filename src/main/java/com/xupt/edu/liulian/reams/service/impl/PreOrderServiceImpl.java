package com.xupt.edu.liulian.reams.service.impl;

import com.xupt.edu.liulian.reams.mapper.PreOrderMapper;
import com.xupt.edu.liulian.reams.pojo.PreOrder;
import com.xupt.edu.liulian.reams.service.PreOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreOrderServiceImpl implements PreOrderService {
    @Autowired
    PreOrderMapper preOrderMapper;

    @Override
    public void add(PreOrder preOrder){
        preOrderMapper.insert(preOrder);
    }
    @Override
    public void delete(Integer id){
        preOrderMapper.deleteByPrimaryKey(id);
    }
    @Override
    public void update(PreOrder preOrder){
        preOrderMapper.updateByPrimaryKeySelective(preOrder);
    }

}
