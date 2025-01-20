package com.ruoyi.agricultural.service.impl;

import com.ruoyi.agricultural.domain.Category;
import com.ruoyi.agricultural.mapper.CategoryMapper;
import com.ruoyi.agricultural.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 11:07
 */
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryMapper categoryMapper;

    /**
     * 获取所有分类列表
     *
     * @return 分类列表
     */
    @Override
    public List<Category> getAllCategories() {
        return categoryMapper.getAllCategories();
    }

    /**
     * 根据分类ID查询分类信息
     *
     * @param categoryId 分类ID
     * @return 分类对象
     */
    @Override
    public Category getCategoryById(Long categoryId) {
        return categoryMapper.getCategoryById(categoryId);
    }

    /**
     * 添加分类
     *
     * @param category 分类对象
     * @return 添加成功返回 true，否则返回 false
     */
    @Override
    public boolean addCategory(Category category) {
        int rows = categoryMapper.addCategory(category);
        return rows > 0;
    }

    /**
     * 更新分类信息
     *
     * @param category 分类对象
     * @return 更新成功返回 true，否则返回 false
     */
    @Override
    public boolean updateCategory(Category category) {
        int rows = categoryMapper.updateCategory(category);
        return rows > 0;
    }

    /**
     * 删除分类
     *
     * @param categoryId 分类ID
     * @return 删除成功返回 true，否则返回 false
     */
    @Override
    public boolean deleteCategory(Long categoryId) {
        int rows = categoryMapper.deleteCategory(categoryId);
        return rows > 0;
    }
}
