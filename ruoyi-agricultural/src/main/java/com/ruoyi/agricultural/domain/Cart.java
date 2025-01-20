package com.ruoyi.agricultural.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author 范佳兴
 * @date 2025/1/20 9:57
 */
@TableName("ams_cart")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Cart implements Serializable {
    /**
     * 购物车ID
     */
    private Long cartId;

    /**
     * 用户ID（外键，关联users表）
     */
    private Long userId;

    /**
     * 产品ID（外键，关联products表）
     */
    private Long productId;

    private static final long serialVersionUID = 1L;
}
