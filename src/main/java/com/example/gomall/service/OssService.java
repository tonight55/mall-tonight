package com.example.gomall.service;

import com.example.gomall.dto.OssCallbackResult;
import com.example.gomall.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * 　　* @author lee
 * 　　* @date 2022/5/12 16:17
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
