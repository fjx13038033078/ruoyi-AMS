package com.ruoyi.agricultural.service.impl;

import com.ruoyi.agricultural.domain.Order;
import com.ruoyi.agricultural.mapper.OrderMapper;
import com.ruoyi.agricultural.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 11:17
 */
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderMapper orderMapper;

    /**
     * 根据用户ID获取用户的所有订单
     *
     * @param userId 用户ID
     * @return 用户的订单列表
     */
    @Override
    public List<Order> listOrdersByUserId(Long userId) {
        return orderMapper.listOrdersByUserId(userId);
    }

    /**
     * 根据订单ID获取订单信息
     *
     * @param orderId 订单ID
     * @return 订单信息
     */
    @Override
    public Order getOrderById(Long orderId) {
        return orderMapper.getOrderById(orderId);
    }

    /**
     * 添加订单
     *
     * @param order 待添加的订单信息
     * @return 添加成功返回 true，否则返回 false
     */
    @Override
    public boolean addOrder(Order order) {
        int rows = orderMapper.addOrder(order);
        return rows > 0;
    }

    /**
     * 更新订单信息
     *
     * @param order 待更新的订单信息
     * @return 更新成功返回 true，否则返回 false
     */
    @Override
    public boolean updateOrder(Order order) {
        int rows = orderMapper.updateOrder(order);
        return rows > 0;
    }

    /**
     * 删除订单
     *
     * @param orderId 待删除的订单ID
     * @return 删除成功返回 true，否则返回 false
     */
    @Override
    public boolean deleteOrder(Long orderId) {
        int rows = orderMapper.deleteOrder(orderId);
        return rows > 0;
    }

    /**
     * 根据订单状态获取订单列表
     *
     * @param status 订单状态
     * @return 状态对应的订单列表
     */
    @Override
    public List<Order> listOrdersByStatus(Integer status) {
        return orderMapper.listOrdersByStatus(status);
    }
}
