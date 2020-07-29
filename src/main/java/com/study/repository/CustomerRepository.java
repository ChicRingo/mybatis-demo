package com.study.repository;

import com.study.entity.Customer;

public interface CustomerRepository {
    public Customer findById(long id);
}
