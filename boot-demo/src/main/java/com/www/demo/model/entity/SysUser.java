package com.www.demo.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>@Description 用户信息表 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2021/8/1 20:57 </p>
 */
public class SysUser implements Serializable {
    /**
     * Database Column Remarks:
     *   主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.SU_ID
     *
     * @mbg.generated
     */
    private Integer suId;

    /**
     * Database Column Remarks:
     *   用户名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.USER_ID
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * Database Column Remarks:
     *   用户名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.USER_NAME
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * Database Column Remarks:
     *   密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.PASS_WORD
     *
     * @mbg.generated
     */
    private String passWord;

    /**
     * Database Column Remarks:
     *   是否删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.IS_DELETE
     *
     * @mbg.generated
     */
    private String isDelete;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.SYS_UPDATE_DATE
     *
     * @mbg.generated
     */
    private Date sysUpdateDate;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.SYS_CREATE_DATE
     *
     * @mbg.generated
     */
    private Date sysCreateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.SU_ID
     *
     * @return the value of sys_user.SU_ID
     *
     * @mbg.generated
     */
    public Integer getSuId() {
        return suId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.SU_ID
     *
     * @param suId the value for sys_user.SU_ID
     *
     * @mbg.generated
     */
    public void setSuId(Integer suId) {
        this.suId = suId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.USER_ID
     *
     * @return the value of sys_user.USER_ID
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.USER_ID
     *
     * @param userId the value for sys_user.USER_ID
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.USER_NAME
     *
     * @return the value of sys_user.USER_NAME
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.USER_NAME
     *
     * @param userName the value for sys_user.USER_NAME
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.PASS_WORD
     *
     * @return the value of sys_user.PASS_WORD
     *
     * @mbg.generated
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.PASS_WORD
     *
     * @param passWord the value for sys_user.PASS_WORD
     *
     * @mbg.generated
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.IS_DELETE
     *
     * @return the value of sys_user.IS_DELETE
     *
     * @mbg.generated
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.IS_DELETE
     *
     * @param isDelete the value for sys_user.IS_DELETE
     *
     * @mbg.generated
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.SYS_UPDATE_DATE
     *
     * @return the value of sys_user.SYS_UPDATE_DATE
     *
     * @mbg.generated
     */
    public Date getSysUpdateDate() {
        return sysUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.SYS_UPDATE_DATE
     *
     * @param sysUpdateDate the value for sys_user.SYS_UPDATE_DATE
     *
     * @mbg.generated
     */
    public void setSysUpdateDate(Date sysUpdateDate) {
        this.sysUpdateDate = sysUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.SYS_CREATE_DATE
     *
     * @return the value of sys_user.SYS_CREATE_DATE
     *
     * @mbg.generated
     */
    public Date getSysCreateDate() {
        return sysCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.SYS_CREATE_DATE
     *
     * @param sysCreateDate the value for sys_user.SYS_CREATE_DATE
     *
     * @mbg.generated
     */
    public void setSysCreateDate(Date sysCreateDate) {
        this.sysCreateDate = sysCreateDate;
    }
}