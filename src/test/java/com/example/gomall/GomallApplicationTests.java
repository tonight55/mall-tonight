package com.example.gomall;

import com.example.gomall.common.api.CommonResult;
import com.example.gomall.controller.PmsBrandController;
import com.example.gomall.service.PmsBrandService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class GomallApplicationTests {
/**
    @Autowired
    private PmsBrandService pmsBrandService;
    @Autowired
    private PmsBrandController pmsBrandController;

    @Before
    public void textBefore() {
        System.out.println("开始测试：");
    }
    @After
    public void textAfter() {
        System.out.println("测试结束。");
    }

    @Test
    @Transactional
    public void contextLoads() {
        List<PmsBrand> pmsBrands = pmsBrandService.listPmsBrand();
        for (PmsBrand pmsBrand : pmsBrands) {
            System.out.println(pmsBrand.toString());
        }
    }
    @Test
    @Transactional
    public void controllerText(){
        CommonResult<List<PmsBrand>> brandList = pmsBrandController.getBrandList();
        List<PmsBrand> data = brandList.getData();
        for (PmsBrand datum : data) {
            System.out.println(datum.toString());
        }
    }
*/
}
