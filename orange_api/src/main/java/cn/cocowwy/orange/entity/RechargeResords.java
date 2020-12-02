package cn.cocowwy.orange.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.InputStream;


/**
 * @author Cocowwy
 * @since 2020-12-02 14:03:54
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Builder
@TableName(value = "t_recharge_resords")
public class RechargeResords extends Model {
    private static final long serialVersionUID = 517558920212184467L;

    /**
     * 充值流水号
     */
    @TableField("serial_number")
    private Long serialNumber;

    /**
     * 用户唯一标识 id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 充值橙币数量
     */
    @TableField("orange_money")
    private Integer orangeMoney;

    /**
     * 充值时间
     */
    @TableField("recharge_time")
    private InputStream rechargeTime;

    /**
     * 预留字段1
     */
    @TableField("rsrv_str1")
    private String rsrvStr1;

    /**
     * 预留字段2
     */
    @TableField("rsrv_str2")
    private String rsrvStr2;

}