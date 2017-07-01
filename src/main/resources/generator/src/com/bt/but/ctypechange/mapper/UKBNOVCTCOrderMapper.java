package com.bt.but.ctypechange.mapper;

import com.bt.but.ctypechange.mapper.UKBNOVCTCOrder;
import com.bt.but.ctypechange.mapper.UKBNOVCTCOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UKBNOVCTCOrderMapper {
    int countByExample(UKBNOVCTCOrderExample example);

    int deleteByExample(UKBNOVCTCOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(UKBNOVCTCOrder record);

    int insertSelective(UKBNOVCTCOrder record);

    List<UKBNOVCTCOrder> selectByExample(UKBNOVCTCOrderExample example);

    UKBNOVCTCOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UKBNOVCTCOrder record, @Param("example") UKBNOVCTCOrderExample example);

    int updateByExample(@Param("record") UKBNOVCTCOrder record, @Param("example") UKBNOVCTCOrderExample example);

    int updateByPrimaryKeySelective(UKBNOVCTCOrder record);

    int updateByPrimaryKey(UKBNOVCTCOrder record);
}