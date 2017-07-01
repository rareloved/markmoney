package com.sjz.markmoney.service.impl;

import com.sjz.markmoney.dao.MarkInfoMapper;
import com.sjz.markmoney.domain.MarkInfo;
import com.sjz.markmoney.service.MarkMoneyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: andy
 * Date: 2017/7/1
 * Time: 17:52
 */
@Service("markMoneyService")
public class MarkMoneyServiceImpl implements MarkMoneyService {
    @Resource
    private MarkInfoMapper markInfoMapper;
    public void saveMark(MarkInfo markInfo) {
        markInfoMapper.insert(markInfo);
    }

    public List<MarkInfo> getNear10MarkList(String userId) {
        return markInfoMapper.getNear10MarkList(userId);
    }
}
