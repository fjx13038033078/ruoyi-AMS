package com.ruoyi.web.controller.agriculture;

import com.ruoyi.agricultural.domain.Order;
import com.ruoyi.agricultural.service.OrderService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 范佳兴
 * @date 2025/1/20 15:12
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/agricultural/order")
public class OrderController extends BaseController {
    private final OrderService orderService;

    // 根据用户ID获取用户的所有订单
    @GetMapping("/listByUser")
    public AjaxResult listOrdersByUserId(@RequestParam Long userId) {
        List<Order> orders = orderService.listOrdersByUserId(userId);
        return success(orders);
    }

    // 根据订单ID获取订单信息
    @GetMapping("/detail")
    public AjaxResult getOrderById(@RequestParam Long orderId) {
        return success(orderService.getOrderById(orderId));
    }

    // 添加订单
    @PostMapping("/add")
    public AjaxResult addOrder(@RequestBody Order order) {
        return toAjax(orderService.addOrder(order));
    }

    // 更新订单信息
    @PostMapping("/update")
    public AjaxResult updateOrder(@RequestBody Order order) {
        return toAjax(orderService.updateOrder(order));
    }

    // 删除订单
    @PostMapping("/delete")
    public AjaxResult deleteOrder(@RequestParam Long orderId) {
        return toAjax(orderService.deleteOrder(orderId));
    }

    // 根据订单状态获取订单列表
    @GetMapping("/listByStatus")
    public AjaxResult listOrdersByStatus(@RequestParam Integer status) {
        List<Order> orders = orderService.listOrdersByStatus(status);
        return success(orders);
    }
}
