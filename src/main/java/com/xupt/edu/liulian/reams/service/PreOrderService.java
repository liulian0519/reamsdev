package com.xupt.edu.liulian.reams.service;

import com.xupt.edu.liulian.reams.pojo.PreOrder;

public interface PreOrderService {
    void add(PreOrder preOrder);
    void delete(Integer id);
    void update(PreOrder preOrder);
}
