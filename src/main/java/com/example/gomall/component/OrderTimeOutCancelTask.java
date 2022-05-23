package com.example.gomall.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * 　　* @author lee
 * 　　* @date 2022/5/3 9:05
 */
@Component
public class OrderTimeOutCancelTask {
    private Logger LOGGER= LoggerFactory.getLogger(OrderTimeOutCancelTask.class);


    @Scheduled(cron = "0 0/10 * ? * ?")
    private void cancelTimeOutOrder(){
        // TODO: 此处应调用取消订单的方法
        LOGGER.info("取消订单，并根据sku编号释放锁定库存");
    }


}
