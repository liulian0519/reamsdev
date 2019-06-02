package com.xupt.edu.liulian.reams.service.impl;

import com.xupt.edu.liulian.reams.mapper.CommunityMapper;
import com.xupt.edu.liulian.reams.pojo.Community;
import com.xupt.edu.liulian.reams.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    CommunityMapper communityMapper;
    @Override
    public void add(Community community){
        communityMapper.insert(community);
    }
    @Override
    public void update(Community community){
        communityMapper.updateByPrimaryKeySelective(community);
    }

}
