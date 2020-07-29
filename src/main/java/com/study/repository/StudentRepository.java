package com.study.repository;

import com.study.entity.Student;

public interface StudentRepository {
    public Student findById(long id);

    public Student findByIdLazy(long id);
}
