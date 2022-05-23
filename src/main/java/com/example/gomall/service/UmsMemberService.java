package com.example.gomall.service;

import com.example.gomall.common.api.CommonResult;

/**
 * 　　* @author lee
 * 　　* @date 2022/4/25 18:38
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
