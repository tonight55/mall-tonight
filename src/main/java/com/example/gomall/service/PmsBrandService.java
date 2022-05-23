package com.example.gomall.service;

import com.example.gomall.mbg.model.PmsBrand;

import java.util.List;

/**
 * 　　* @author lee
 * 　　* @date 2022/4/18 17:40
 */

public interface PmsBrandService {

    List<PmsBrand> listPmsBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

}
