package com.pmsback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName sys_user
 */
@TableName(value ="sys_user")
@Data
public class SysUser implements Serializable {
    /**
     * User ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * Username
     */
    private String username;

    /**
     * Password
     */
    private String password;

    /**
     * User Avatar
     */
    private String avatar;

    /**
     * User Email
     */
    private String email;

    /**
     * Phone Number
     */
    private String phone;

    /**
     * Last Login Time
     */
    private Date loginDate;

    /**
     * Account Status (0: Inactive, 1: Active)
     */
    private String status;

    /**
     * Creation Time
     */
    private Date createTime;

    /**
     * Update Time
     */
    private Date updateTime;

    /**
     * Remarks
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}