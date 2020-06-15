package com.shangguan.spring.service.impl;

import com.shangguan.spring.beans.Code;
import com.shangguan.spring.mapper.CodeMapper;
import com.shangguan.spring.service.CodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

@Service
public class CodeServiceImpl implements CodeService{


    @Resource
    private CodeMapper codeMapper;

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return codeMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insert(Code record) {
        return codeMapper.insert(record);
    }

    @Override
    public int insertSelective(Code record) {
        return codeMapper.insertSelective(record);
    }

    @Override
    public Code selectByPrimaryKey(Integer cid) {
        return codeMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByPrimaryKeySelective(Code record) {
        return codeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Code record) {
        return codeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Code> selectAllCode() {
        return codeMapper.selectAllCode();
    }


}
