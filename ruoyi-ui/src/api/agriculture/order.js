// order.js

import request from '@/utils/request'

// 根据用户ID获取用户的所有订单
export function listOrdersByUserId(userId) {
  return request({
    url: '/agricultural/order/listByUser',
    method: 'get',
    params: { userId }
  })
}

// 根据订单ID获取订单信息
export function getOrderById(orderId) {
  return request({
    url: '/agricultural/order/detail',
    method: 'get',
    params: { orderId }
  })
}

// 添加订单
export function addOrder(data) {
  return request({
    url: '/agricultural/order/add',
    method: 'post',
    data: data
  })
}

// 更新订单信息
export function updateOrder(data) {
  return request({
    url: '/agricultural/order/update',
    method: 'post',
    data: data
  })
}

// 删除订单
export function deleteOrder(orderId) {
  return request({
    url: '/agricultural/order/delete',
    method: 'post',
    params: { orderId }
  })
}

// 根据订单状态获取订单列表
export function listOrdersByStatus(status) {
  return request({
    url: '/agricultural/order/listByStatus',
    method: 'get',
    params: { status }
  })
}
