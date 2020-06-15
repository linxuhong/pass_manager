package com.shangguan.spring.mapper;

import com.shangguan.spring.beans.Person;

import java.util.List;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    List<Person> selectAllCode();
}