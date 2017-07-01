package com.sjz.markmoney.dao;

import com.sjz.markmoney.domain.MarkInfo;

import java.util.List;

public interface MarkInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(MarkInfo record);

    int insertSelective(MarkInfo record);

    MarkInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MarkInfo record);

    int updateByPrimaryKey(MarkInfo record);

    /**
     * 查询用户最近10笔记账
     * @param userId
     * @return
     */
    List<MarkInfo> getNear10MarkList(String userId);
}