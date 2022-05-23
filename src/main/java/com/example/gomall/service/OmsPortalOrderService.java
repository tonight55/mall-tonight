package com.example.gomall.service;

import com.example.gomall.common.api.CommonResult;
import com.example.gomall.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * 　　* @author lee
 * 　　* @date 2022/5/10 20:44
 */
public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}
