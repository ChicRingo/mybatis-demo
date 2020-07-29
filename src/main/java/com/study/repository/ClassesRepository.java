package com.study.repository;

import com.study.entity.Classes;

public interface ClassesRepository {
    public Classes findById(long id);

    public Classes findByIdLazy(long id);
}