package com.ruoyi.agricultural.service.impl;

import com.ruoyi.agricultural.domain.Cart;
import com.ruoyi.agricultural.mapper.CartMapper;
import com.ruoyi.agricultural.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 11:09
 */
@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartMapper cartMapper;

    /**
     * 获取用户的购物车列表
     *
     * @param userId 用户ID
     * @return 购物车列表
     */
    @Override
    public List<Cart> getCartByUserId(Long userId) {
        return cartMapper.getCartByUserId(userId);
    }

    /**
     * 根据购物车ID查询购物车信息
     *
     * @param cartId 购物车ID
     * @return 购物车对象
     */
    @Override
    public Cart getCartById(Long cartId) {
        return cartMapper.getCartById(cartId);
    }

    /**
     * 添加商品到购物车
     *
     * @param cart 购物车对象
     * @return 添加成功返回 true，否则返回 false
     */
    @Override
    public boolean addToCart(Cart cart) {
        int rows = cartMapper.addToCart(cart);
        return rows > 0;
    }

    /**
     * 从购物车删除商品
     *
     * @param cartId 购物车ID
     * @return 删除成功返回 true，否则返回 false
     */
    @Override
    public boolean removeFromCart(Long cartId) {
        int rows = cartMapper.removeFromCart(cartId);
        return rows > 0;
    }

    /**
     * 删除用户购物车中的所有商品
     *
     * @param userId 用户ID
     * @return 删除成功返回 true，否则返回 false
     */
    @Override
    public boolean clearCart(Long userId) {
        int rows = cartMapper.clearCart(userId);
        return rows > 0;
    }
}
