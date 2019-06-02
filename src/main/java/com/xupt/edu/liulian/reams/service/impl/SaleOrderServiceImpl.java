package com.xupt.edu.liulian.reams.service.impl;

import com.xupt.edu.liulian.reams.dto.Green;
import com.xupt.edu.liulian.reams.mapper.GreenHouseMapper;
import com.xupt.edu.liulian.reams.mapper.SaleOrderMapper;
import com.xupt.edu.liulian.reams.pojo.GreenHouse;
import com.xupt.edu.liulian.reams.pojo.GreenHouseExample;
import com.xupt.edu.liulian.reams.pojo.SaleOrder;
import com.xupt.edu.liulian.reams.pojo.SaleOrderExample;
import com.xupt.edu.liulian.reams.service.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleOrderServiceImpl implements SaleOrderService {
    @Autowired
    SaleOrderMapper saleOrderMapper;
    @Autowired
    GreenHouseMapper greenHouseMapper;

    @Override
    public void add(SaleOrder saleOrder){
        saleOrderMapper.insert(saleOrder);
    }
    @Override
    public void update(SaleOrder saleOrder){
        saleOrderMapper.updateByPrimaryKeySelective(saleOrder);
    }
//    @Autowired
//    public Green selectByPhone(String phone){
//        SaleOrderExample saleOrderExample = new SaleOrderExample();
//        saleOrderExample.createCriteria().andPhoneEqualTo(phone);
//        List<SaleOrder> saleOrderList = saleOrderMapper.selectByExample(saleOrderExample);
//
//        GreenHouseExample greenHouseExample = new GreenHouseExample();
//        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);
//        for(SaleOrder saleOrder:saleOrderList){
//            for(GreenHouse greenHouse:greenHouses){
//                if(saleOrder.getGreenhouse_id() == greenHouse.getId()){
//
//                }
//            }
//        }
//
//    }
}
