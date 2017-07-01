package com.sjz.markmoney.dao;

import com.sjz.markmoney.domain.LogInfo;

public interface LogInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(LogInfo record);

    int insertSelective(LogInfo record);

    LogInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LogInfo record);

    int updateByPrimaryKey(LogInfo record);
}