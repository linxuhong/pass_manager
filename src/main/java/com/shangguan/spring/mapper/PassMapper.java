package com.shangguan.spring.mapper;

import com.shangguan.spring.beans.Pass;

import java.util.List;
import java.util.Map;

/**
 * 通行证信息
 */

public interface PassMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Pass record);

    int insertSelective(Pass record);

    Pass selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Pass record);

    int updateByPrimaryKey(Pass record);

    List<Pass> selectAllCode();
    List<Map> selectPassBykey();
}