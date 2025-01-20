package com.ruoyi.agricultural.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author 范佳兴
 * @date 2025/1/20 10:04
 */
@TableName("ams_orders")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Order implements Serializable {

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 用户ID（外键，关联users表）
     */
    private Long userId;

    /**
     * 用户名
     */
    @TableField(exist = false)
    private String userName;

    /**
     * 产品ID（外键，关联products表）
     */
    private Long productId;

    /**
     * 产品名称
     */
    @TableField(exist = false)
    private String productName;

    /**
     * 购买数量
     */
    private Integer quantity;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 总金额
     */
    private BigDecimal totalAmount;

    /**
     * 订单状态（0: 待支付，1: 已支付，2: 已发货，3: 已完成，4: 已取消，5: 已退款）
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}
