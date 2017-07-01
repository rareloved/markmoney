package com.sjz.markmoney.dao;

import com.sjz.markmoney.domain.ConsumerType;

public interface ConsumerTypeMapper {
    int deleteByPrimaryKey(Integer consumerType);

    int insert(ConsumerType record);

    int insertSelective(ConsumerType record);

    ConsumerType selectByPrimaryKey(Integer consumerType);

    int updateByPrimaryKeySelective(ConsumerType record);

    int updateByPrimaryKey(ConsumerType record);
}