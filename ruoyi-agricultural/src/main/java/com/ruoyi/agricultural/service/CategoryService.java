package com.ruoyi.agricultural.service;

import com.ruoyi.agricultural.domain.Category;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 11:07
 */
public interface CategoryService {
    /**
     * 获取所有分类列表
     *
     * @return 分类列表
     */
    List<Category> getAllCategories();

    /**
     * 根据分类ID查询分类信息
     *
     * @param categoryId 分类ID
     * @return 分类对象
     */
    Category getCategoryById(Long categoryId);

    /**
     * 添加分类
     *
     * @param category 分类对象
     * @return 添加成功返回 true，否则返回 false
     */
    boolean addCategory(Category category);

    /**
     * 更新分类信息
     *
     * @param category 分类对象
     * @return 更新成功返回 true，否则返回 false
     */
    boolean updateCategory(Category category);

    /**
     * 删除分类
     *
     * @param categoryId 分类ID
     * @return 删除成功返回 true，否则返回 false
     */
    boolean deleteCategory(Long categoryId);
}
