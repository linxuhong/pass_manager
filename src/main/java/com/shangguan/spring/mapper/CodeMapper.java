package com.shangguan.spring.mapper;

import com.shangguan.spring.beans.Code;

import java.util.List;

public interface CodeMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Code record);

    int insertSelective(Code record);

    Code selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Code record);

    int updateByPrimaryKey(Code record);

    List<Code> selectAllCode();
}