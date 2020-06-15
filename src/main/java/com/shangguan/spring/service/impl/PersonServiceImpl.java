package com.shangguan.spring.service.impl;

import com.shangguan.spring.beans.Person;
import com.shangguan.spring.mapper.PersonMapper;
import com.shangguan.spring.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Resource
    private PersonMapper personMapper;

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return personMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insert(Person record) {
        return personMapper.insert(record);
    }

    @Override
    public int insertSelective(Person record) {
        return personMapper.insertSelective(record);
    }

    @Override
    public Person selectByPrimaryKey(Integer cid) {
        return personMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByPrimaryKeySelective(Person record) {
        return personMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Person record) {
        return personMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Person> selectAllCode() {
        return personMapper.selectAllCode();
    }


}
