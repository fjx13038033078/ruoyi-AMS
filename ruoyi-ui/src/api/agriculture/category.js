// category.js

import request from '@/utils/request'

// 获取所有分类列表
export function listCategories() {
  return request({
    url: '/agricultural/category/list',
    method: 'get'
  })
}

// 根据分类ID查询分类信息
export function getCategoryById(categoryId) {
  return request({
    url: '/agricultural/category/detail',
    method: 'get',
    params: { categoryId }
  })
}

// 添加分类
export function addCategory(data) {
  return request({
    url: '/agricultural/category/add',
    method: 'post',
    data: data
  })
}

// 更新分类信息
export function updateCategory(data) {
  return request({
    url: '/agricultural/category/update',
    method: 'post',
    data: data
  })
}

// 删除分类
export function deleteCategory(categoryId) {
  return request({
    url: '/agricultural/category/delete',
    method: 'post',
    params: { categoryId }
  })
}
