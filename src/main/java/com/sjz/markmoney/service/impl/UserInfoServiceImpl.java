package com.sjz.markmoney.service.impl;

import com.sjz.markmoney.dao.UserInfoMapper;
import com.sjz.markmoney.domain.UserInfo;
import com.sjz.markmoney.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: andy
 * Date: 2017/7/1
 * Time: 18:16
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;
    public UserInfo getUserInfoByName(String username) {
        UserInfo userInfo = userInfoMapper.getUserInfoByName(username);
        return userInfo;
    }
}
