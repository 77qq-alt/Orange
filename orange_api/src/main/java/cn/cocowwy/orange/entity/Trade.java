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
 * @since 2020-12-02 14:04:20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Builder
@TableName(value = "t_trade")
public class Trade extends Model {
    private static final long serialVersionUID = 423579904802080683L;

    /**
     * 订单唯一标识id
     */
    @TableField("trade_id")
    private Long tradeId;

    /**
     * 订单创建时间
     */
    @TableField("create_time")
    private InputStream createTime;

    /**
     * 订单创建用户userId
     */
    @TableField("create_user")
    private Long createUser;

    /**
     * 订单状态 0正常 1已接 2完工 3取消 4超时 5举报 6封禁
     */
    @TableField("status_tag")
    private String statusTag;

    /**
     * 订单状态变更时间
     */
    @TableField("change_time")
    private InputStream changeTime;

    /**
     * 接单用户userId
     */
    @TableField("accept_user")
    private Long acceptUser;

    /**
     * 接单用户时间
     */
    @TableField("accept_time")
    private InputStream acceptTime;

    /**
     * 订单标题
     */
    @TableField("title")
    private String title;

    /**
     * 订单内容
     */
    @TableField("content")
    private String content;

    /**
     * 订单小费
     */
    @TableField("tips")
    private Integer tips;

    /**
     * 订单类型  0代拿快递   1食堂代买 2超市代买 3代拿 4询问 5其他
     */
    @TableField("order_type")
    private String orderType;

    /**
     * 订单派送地址
     */
    @TableField("address")
    private String address;

    /**
     * 订单期待完成时间
     */
    @TableField("expect_time")
    private InputStream expectTime;

    /**
     * 订单预存活到期时间
     */
    @TableField("alive_time")
    private InputStream aliveTime;

    /**
     * 订单备注消息
     */
    @TableField("message")
    private String message;

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

    /**
     * 预留字段3
     */
    @TableField("rsrv_str3")
    private String rsrvStr3;

}