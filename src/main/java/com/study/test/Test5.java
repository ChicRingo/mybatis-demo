package com.study.test;

import com.study.entity.Account;
import com.study.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Account account = new Account();

        account.setId(1L);
//        account.setUsername("张三");
//        account.setPassword("123123");
        account.setAge(22);

//        findByAccount
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
        Account account1 = accountRepository.findByAccount(account);
        System.out.println(account1);

////        findByAccount2
//        AccountRepository accountRepository2 = sqlSession.getMapper(AccountRepository.class);
//        Account account2 = accountRepository2.findByAccount2(account);
//        System.out.println(account2);
//
////        findByAccount3
//        AccountRepository accountRepository3 = sqlSession.getMapper(AccountRepository.class);
//        Account account3 = accountRepository3.findByAccount3(account);
//        System.out.println(account3);


//      update2
        account.setUsername("张三12");
        System.out.println("update2="+accountRepository.update2(account));


        List<Long> ids = new ArrayList<Long>();
        ids.add(1L);
        ids.add(2L);
        ids.add(5L);
        account.setIds(ids);
        System.out.println(accountRepository.findByIds(account));


        sqlSession.commit();
        sqlSession.close();
    }
}