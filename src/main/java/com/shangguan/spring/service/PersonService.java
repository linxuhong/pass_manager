package com.shangguan.spring.service;

import com.shangguan.spring.beans.Person;

import java.util.List;


public interface PersonService {


    int deleteByPrimaryKey(Integer cid);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    List<Person> selectAllCode();
}
