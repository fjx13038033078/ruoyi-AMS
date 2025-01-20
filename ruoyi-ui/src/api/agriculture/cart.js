// cart.js

import request from '@/utils/request'

// 获取用户的购物车列表
export function listCartByUserId(userId) {
  return request({
    url: '/agricultural/cart/list',
    method: 'get',
    params: { userId }
  })
}

// 根据购物车ID查询购物车信息
export function getCartById(cartId) {
  return request({
    url: '/agricultural/cart/detail',
    method: 'get',
    params: { cartId }
  })
}

// 添加商品到购物车
export function addToCart(data) {
  return request({
    url: '/agricultural/cart/add',
    method: 'post',
    data: data
  })
}

// 从购物车删除商品
export function removeFromCart(cartId) {
  return request({
    url: '/agricultural/cart/remove',
    method: 'post',
    params: { cartId }
  })
}

// 删除用户购物车中的所有商品
export function clearCart(userId) {
  return request({
    url: '/agricultural/cart/clear',
    method: 'post',
    params: { userId }
  })
}
