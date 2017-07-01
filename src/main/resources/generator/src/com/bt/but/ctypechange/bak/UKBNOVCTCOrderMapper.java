package com.bt.but.ctypechange.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UKBNOVCTCOrderMapper {
	int countByExample(UKBNOVCTCOrderExample example);

	int deleteByExample(UKBNOVCTCOrderExample example);



	int insertSelective(UKBNOVCTCOrder record);

	List<UKBNOVCTCOrder> selectByExample(UKBNOVCTCOrderExample example);

	int updateByExampleSelective(@Param("record") UKBNOVCTCOrder record, @Param("example") UKBNOVCTCOrderExample example);

	int updateByExample(@Param("record") UKBNOVCTCOrder record, @Param("example") UKBNOVCTCOrderExample example);

	
	/********/
	
	int insert(UKBNOVCTCOrder record);
	
	String getRequestIdFromSeq();

	List<UKBNOVCTCOrder> selectByReqID(String reqID);
	List<UKBNOVCTCOrder> selectByStatus(String status);

	List<UKBNOVCTCOrder> selectFailedRecByReqID(String reqID);

	List<UKBNOVCTCOrder> selectNonFailedRecByReqID(String reqID);

	List<StatusCount> selectCountByReqID(String reqID);
	
	int updateStatusByID(Map<String, Object> params);

}