package com.ruoyi.agricultural.service;

import com.ruoyi.agricultural.domain.Order;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 11:16
 */
public interface OrderService {
    /**
     * 根据用户ID获取用户的所有订单
     *
     * @param userId 用户ID
     * @return 用户的订单列表
     */
    List<Order> listOrdersByUserId(Long userId);

    /**
     * 根据订单ID获取订单信息
     *
     * @param orderId 订单ID
     * @return 订单信息
     */
    Order getOrderById(Long orderId);

    /**
     * 添加订单
     *
     * @param order 待添加的订单信息
     * @return 添加成功返回 true，否则返回 false
     */
    boolean addOrder(Order order);

    /**
     * 更新订单信息
     *
     * @param order 待更新的订单信息
     * @return 更新成功返回 true，否则返回 false
     */
    boolean updateOrder(Order order);

    /**
     * 删除订单
     *
     * @param orderId 待删除的订单ID
     * @return 删除成功返回 true，否则返回 false
     */
    boolean deleteOrder(Long orderId);

    /**
     * 根据订单状态获取订单列表
     *
     * @param status 订单状态
     * @return 状态对应的订单列表
     */
    List<Order> listOrdersByStatus(Integer status);
}
