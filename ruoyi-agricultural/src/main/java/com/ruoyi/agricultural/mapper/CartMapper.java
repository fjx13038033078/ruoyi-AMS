package com.ruoyi.agricultural.mapper;

import com.ruoyi.agricultural.domain.Cart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 10:15
 */
@Mapper
public interface CartMapper {
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
     * @return 添加成功的数量
     */
    int addToCart(Cart cart);

    /**
     * 从购物车中删除商品
     *
     * @param cartId 购物车ID
     * @return 删除成功的数量
     */
    int removeFromCart(Long cartId);

    /**
     * 删除用户购物车中的所有商品
     *
     * @param userId 用户ID
     * @return 删除成功的数量
     */
    int clearCart(Long userId);
}
