package com.ruoyi.web.controller.agriculture;

import com.ruoyi.agricultural.domain.Review;
import com.ruoyi.agricultural.service.ReviewService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 15:09
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/agricultural/review")
public class ReviewController  extends BaseController {

    private final ReviewService reviewService;

    // 根据产品ID获取评论列表
    @GetMapping("/list")
    public AjaxResult listReviewsByProductId(@RequestParam Long productId) {
        List<Review> reviews = reviewService.listReviewsByProductId(productId);
        return success(reviews);
    }

    // 根据评论ID获取评论信息
    @GetMapping("/detail")
    public AjaxResult getReviewById(@RequestParam Long reviewId) {
        return success(reviewService.getReviewById(reviewId));
    }

    // 添加评论
    @PostMapping("/add")
    public AjaxResult addReview(@RequestBody Review review) {
        return toAjax(reviewService.addReview(review));
    }

    // 删除评论
    @PostMapping("/delete")
    public AjaxResult deleteReview(@RequestParam Long reviewId) {
        return toAjax(reviewService.deleteReview(reviewId));
    }
}
