// product.js

import request from '@/utils/request'

// 查询所有产品列表
export function listProducts(query) {
  return request({
    url: '/agricultural/product/listAll',
    method: 'get',
    params: query
  })
}

// 根据分类ID获取产品列表
export function listProductsByCategoryId(categoryId) {
  return request({
    url: '/agricultural/product/listByCategory',
    method: 'get',
    params: { categoryId }
  })
}

// 根据用户ID获取产品列表
export function listProductsByUserId(userId) {
  return request({
    url: '/agricultural/product/listByUser',
    method: 'get',
    params: { userId }
  })
}

// 查询产品详细信息
export function getProduct(productId) {
  return request({
    url: '/agricultural/product/detail',
    method: 'get',
    params: { productId }
  })
}

// 添加产品
export function addProduct(data) {
  return request({
    url: '/agricultural/product/add',
    method: 'post',
    data: data
  })
}

// 更新产品信息
export function updateProduct(data) {
  return request({
    url: '/agricultural/product/update',
    method: 'post',
    data: data
  })
}

// 删除产品
export function deleteProduct(productId) {
  return request({
    url: '/agricultural/product/delete',
    method: 'post',
    params: { productId }
  })
}
