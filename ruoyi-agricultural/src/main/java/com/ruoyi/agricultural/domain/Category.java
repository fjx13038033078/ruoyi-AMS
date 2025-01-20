package com.ruoyi.agricultural.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author 范佳兴
 * @date 2025/1/20 9:55
 */
@TableName("ams_categories")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Category implements Serializable {
    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 分类名称
     */
    private String categoryName;

    private static final long serialVersionUID = 1L;
}
