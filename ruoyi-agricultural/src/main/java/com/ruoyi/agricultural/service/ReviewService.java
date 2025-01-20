package com.ruoyi.agricultural.service;

import com.ruoyi.agricultural.domain.Review;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 10:58
 */
public interface ReviewService {
    /**
     * 根据产品ID获取评论列表
     *
     * @param productId 产品ID
     * @return 评论列表
     */
    List<Review> listReviewsByProductId(Long productId);

    /**
     * 根据评论ID获取评论信息
     *
     * @param reviewId 评论ID
     * @return 评论信息
     */
    Review getReviewById(Long reviewId);

    /**
     * 添加评论
     *
     * @param review 待添加的评论信息
     * @return 添加成功返回 true，否则返回 false
     */
    boolean addReview(Review review);

    /**
     * 删除评论
     *
     * @param reviewId 待删除的评论ID
     * @return 删除成功返回 true，否则返回 false
     */
    boolean deleteReview(Long reviewId);
}
