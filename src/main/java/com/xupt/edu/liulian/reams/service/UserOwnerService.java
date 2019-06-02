package com.xupt.edu.liulian.reams.service;


import com.xupt.edu.liulian.reams.dto.UserOwnerTest;
import com.xupt.edu.liulian.reams.pojo.user_owner;
import com.xupt.edu.liulian.reams.util.PageInfo;

import java.util.List;

public interface UserOwnerService {
    PageInfo<UserOwnerTest> listByPage(Integer pageNum);
    PageInfo<UserOwnerTest> userByName(Integer pageNum,String name);
    void add(user_owner user_owner);
    void update(user_owner user_owner);
    List<user_owner> listbyphone(String phone);
}
