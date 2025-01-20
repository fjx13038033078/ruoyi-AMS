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
 * @date 2025/1/20 9:54
 */
@TableName("ams_products")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Product implements Serializable {
    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 用户ID（外键，关联用户表）
     */
    private Long userId;

    /**
     * 用户名
     */
    @TableField(exist = false)
    private String userName;

    /**
     * 分类ID（外键，关联分类表）
     */
    private Long categoryId;

    /**
     * 分类名称
     */
    @TableField(exist = false)
    private String categoryName;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品描述
     */
    private String description;

    /**
     * 产品价格
     */
    private BigDecimal price;

    /**
     * 库存数量
     */
    private Integer stock;

    /**
     * 产品状态（1:在售，0:下架）
     */
    private Integer status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
