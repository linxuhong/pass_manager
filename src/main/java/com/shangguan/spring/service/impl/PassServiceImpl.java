package com.shangguan.spring.service.impl;

import com.shangguan.spring.beans.Pass;
import com.shangguan.spring.mapper.PassMapper;
import com.shangguan.spring.service.PassService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PassServiceImpl implements PassService {

    @Resource
    private PassMapper passMapper;

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return passMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insert(Pass record) {
        return passMapper.insert(record);
    }

    @Override
    public int insertSelective(Pass record) {
        return passMapper.insertSelective(record);
    }

    @Override
    public Pass selectByPrimaryKey(Integer cid) {
        return passMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByPrimaryKeySelective(Pass record) {
        return passMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Pass record) {
        return passMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Pass> selectAllCode() {
        return passMapper.selectAllCode();
    }


    public List<Map> selectPassBykey() {
        return passMapper.selectPassBykey();
    }

}
