package com.ruoyi.agricultural.service.impl;

import com.ruoyi.agricultural.domain.Review;
import com.ruoyi.agricultural.mapper.ReviewMapper;
import com.ruoyi.agricultural.service.ReviewService;
import com.ruoyi.common.utils.SecurityUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 10:58
 */
@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewMapper reviewMapper;

    /**
     * 根据产品ID获取评论列表
     *
     * @param productId 产品ID
     * @return 评论列表
     */
    @Override
    public List<Review> listReviewsByProductId(Long productId) {
        return reviewMapper.listReviewsByProductId(productId);
    }

    /**
     * 根据评论ID获取评论信息
     *
     * @param reviewId 评论ID
     * @return 评论信息
     */
    @Override
    public Review getReviewById(Long reviewId) {
        return reviewMapper.getReviewById(reviewId);
    }

    /**
     * 添加评论
     *
     * @param review 待添加的评论信息
     * @return 是否添加成功
     */
    @Override
    public boolean addReview(Review review) {
        Long userId = SecurityUtils.getUserId();  // 获取当前登录用户ID
        review.setUserId(userId);
        review.setCreateTime(LocalDateTime.now());  // 设置评论的创建时间
        int rows = reviewMapper.addReview(review);
        return rows > 0;
    }

    /**
     * 删除评论
     *
     * @param reviewId 待删除的评论ID
     * @return 是否删除成功
     */
    @Override
    public boolean deleteReview(Long reviewId) {
        Long userId = SecurityUtils.getUserId();  // 获取当前登录用户ID
        Review review = reviewMapper.getReviewById(reviewId);
        if (review != null && (userId.equals(review.getUserId()) || userId == 1)) {
            int rows = reviewMapper.deleteReview(reviewId);
            return rows > 0;
        } else {
            throw new RuntimeException("仅可以删除自己的评论");
        }
    }
}
