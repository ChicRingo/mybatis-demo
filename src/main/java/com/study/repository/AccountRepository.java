package com.study.repository;

import com.study.entity.Account;

import java.util.List;

public interface AccountRepository {
    public int save(Account account);

    public int update(Account account);

    public int update2(Account account);

    public int deleteById(long id);

    public List<Account> findAll();

    public Account findById(long id);

    public Account findByName(String name);

    public Account findById2(Long id);

    public Account findByNameAndAge(String name, int age);

    public int count();

    public Integer count2();

    public String findNameById(long id);

    public Account findByAccount(Account account);

    public Account findByAccount2(Account account);

    public Account findByAccount3(Account account);

    public List<Account> findByIds(Account account);
}
