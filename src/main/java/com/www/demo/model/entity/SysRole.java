package com.www.demo.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @version 1.0
 * @Description 角色表对象
 * @Author www
 * @Date 2021/5/19 23:38
 */
public class SysRole implements Serializable {
    /**
     * 主键
     **/
    private BigDecimal id;
    /**
     * 角色ID
     **/
    private String roleId;
    /**
     * 角色名称
     **/
    private String roleName;
    /**
     * 更新时间
     **/
    private Date sysUpdateDate;
    /**
     * 创建时间
     **/
    private Date sysCreateDate;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getSysUpdateDate() {
        return sysUpdateDate;
    }

    public void setSysUpdateDate(Date sysUpdateDate) {
        this.sysUpdateDate = sysUpdateDate;
    }

    public Date getSysCreateDate() {
        return sysCreateDate;
    }

    public void setSysCreateDate(Date sysCreateDate) {
        this.sysCreateDate = sysCreateDate;
    }
}