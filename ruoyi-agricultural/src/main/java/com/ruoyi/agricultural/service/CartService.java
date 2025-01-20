package com.ruoyi.agricultural.service;

import com.ruoyi.agricultural.domain.Cart;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 11:09
 */
public interface CartService {
    /**
     * 获取用户的购物车列表
     *
     * @param userId 用户ID
     * @return 购物车列表
     */
    List<Cart> getCartByUserId(Long userId);

    /**
     * 根据购物车ID查询购物车信息
     *
     * @param cartId 购物车ID
     * @return 购物车对象
     */
    Cart getCartById(Long cartId);

    /**
     * 添加商品到购物车
     *
     * @param cart 购物车对象
     * @return 添加成功返回 true，否则返回 false
     */
    boolean addToCart(Cart cart);

    /**
     * 从购物车删除商品
     *
     * @param cartId 购物车ID
     * @return 删除成功返回 true，否则返回 false
     */
    boolean removeFromCart(Long cartId);

    /**
     * 删除用户购物车中的所有商品
     *
     * @param userId 用户ID
     * @return 删除成功返回 true，否则返回 false
     */
    boolean clearCart(Long userId);
}
