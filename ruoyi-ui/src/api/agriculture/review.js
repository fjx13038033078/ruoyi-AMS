// review.js

import request from '@/utils/request'

// 根据产品ID获取评论列表
export function listReviewsByProductId(productId) {
  return request({
    url: '/agricultural/review/list',
    method: 'get',
    params: { productId }
  })
}

// 根据评论ID获取评论信息
export function getReviewById(reviewId) {
  return request({
    url: '/agricultural/review/detail',
    method: 'get',
    params: { reviewId }
  })
}

// 添加评论
export function addReview(data) {
  return request({
    url: '/agricultural/review/add',
    method: 'post',
    data: data
  })
}

// 删除评论
export function deleteReview(reviewId) {
  return request({
    url: '/agricultural/review/delete',
    method: 'post',
    params: { reviewId }
  })
}
