package com.sjz.markmoney.service;

import com.sjz.markmoney.domain.UserInfo;

/**
 * User: andy
 * Date: 2017/7/1
 * Time: 18:15
 */
public interface UserInfoService {
    UserInfo getUserInfoByName(String username);
}
