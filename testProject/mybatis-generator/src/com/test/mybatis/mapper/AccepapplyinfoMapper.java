package com.test.mybatis.mapper;

import com.test.mybatis.po.Accepapplyinfo;

public interface AccepapplyinfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(Accepapplyinfo record);

    int insertSelective(Accepapplyinfo record);

    Accepapplyinfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Accepapplyinfo record);

    int updateByPrimaryKey(Accepapplyinfo record);
}