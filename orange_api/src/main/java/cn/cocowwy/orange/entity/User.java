package cn.cocowwy.orange.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.util.Date;

/**
 * @author Cocowwy
 * @since 2020-12-02 13:34:29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Builder
@TableName(value = "t_user")
public class User extends Model {
    private static final long serialVersionUID = -59439505947821559L;

    /**
     * 用户唯一标识 id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 用户微信号
     */
    @TableField("wx_id")
    private String wxId;

    /**
     * 用户对外展示昵称
     */
    @TableField("name")
    private String name;

    /**
     * 用户真实名称
     */
    @TableField("user_real_name")
    private String userRealName;

    /**
     * 用户性别  0女 1男
     */
    @TableField("sex")
    private String sex;

    /**
     * 收货地址1
     */
    @TableField("address1")
    private String address1;

    /**
     * 收货地址2
     */
    @TableField("address2")
    private String address2;

    /**
     * 用户手机号
     */
    @TableField("phone")
    private String phone;

    /**
     * 校园卡卡号
     */
    @TableField("school_number")
    private String schoolNumber;

    /**
     * 备用联系手机号
     */
    @TableField("phone_bak")
    private String phoneBak;

    /**
     * 用户注册时间
     */
    @TableField("registered_time")
    private Date registeredTime;

    /**
     * 用户销户时间
     */
    @TableField("cancellation_time")
    private Date cancellationTime;

    /**
     * 用户封禁开始时间
     */
    @TableField("suspend_start_time")
    private Date suspendStartTime;

    /**
     * 用户封禁结束时间
     */
    @TableField("suspend_end_time")
    private Date suspendEndTime;

    /**
     * 用户最后一次登录时间
     */
    @TableField("last_login_time")
    private Date lastLoginTime;

    /**
     * 用户状态 0正常  1封禁  2注销
     */
    @TableField("status_tag")
    private String statusTag;

    /**
     * 用户每日订单的派发次数
     */
    @TableField("day_trade_times")
    private Integer dayTradeTimes;

    /**
     * 预留字段2
     */
    @TableField("rsrv_str2")
    private String rsrvStr2;

    /**
     * 预留字段3
     */
    @TableField("rsrv_str3")
    private String rsrvStr3;

    /**
     * 预留字段1
     */
    @TableField("rsrv_str1")
    private String rsrvStr1;

}