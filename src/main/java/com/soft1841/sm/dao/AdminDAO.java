package com.soft1841.sm.dao;

import cn.hutool.db.Entity;
import com.soft1841.sm.entity.Admin;

import java.sql.SQLException;
import java.util.List;

/**
 * 收银员DAO接口
 * @author 陈宇航
 * 2018.12.24
 */
public interface AdminDAO {

    /**
     * 根据账号查询管理员
     * @param account
     * @return
     * @throws SQLException
     */
    Admin getAdminByAccount(String account) throws SQLException;

}
