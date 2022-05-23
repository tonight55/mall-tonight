package com.example.gomall.dao;

import com.example.gomall.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 　　* @author lee
 * 　　* @date 2022/4/29 10:42
 */

public interface UmsAdminRoleRelationDao {
    /**
     * 后台用户与角色管理自定义Dao
     * Created by macro on 2018/10/8.
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

}
