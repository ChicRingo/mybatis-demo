package com.study.repository;

import com.study.entity.Goods;

public interface GoodsRepository {
    public Goods findById(long id);
}
