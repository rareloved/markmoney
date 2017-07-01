package com.sjz.markmoney.service;

import com.sjz.markmoney.domain.MarkInfo;

import java.util.List;

/**
 * User: andy
 * Date: 2017/7/1
 * Time: 17:52
 */
public interface MarkMoneyService {
    void saveMark(MarkInfo markInfo);
    List<MarkInfo> getNear10MarkList(String userId);
}
