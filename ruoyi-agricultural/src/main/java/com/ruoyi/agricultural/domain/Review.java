package com.ruoyi.agricultural.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author 范佳兴
 * @date 2025/1/20 9:59
 */
@TableName("ams_reviews")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Review implements Serializable {
    /**
     * 评论ID
     */
    private Long reviewId;

    /**
     * 用户ID（外键，关联users表）
     */
    private Long userId;

    /**
     * 用户名
     */
    @TableField(exist = false)
    private String userName;

    /**
     * 产品ID（外键，关联products表）
     */
    private Long productId;

    /**
     * 产品名称
     */
    @TableField(exist = false)
    private String productName;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;

    private static final long serialVersionUID = 1L;
}
