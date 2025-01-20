package com.ruoyi.agricultural.mapper;

import com.ruoyi.agricultural.domain.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 10:14
 */
@Mapper
public interface CategoryMapper {
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
     * @return 添加成功的分类数量
     */
    int addCategory(Category category);

    /**
     * 更新分类信息
     *
     * @param category 分类对象
     * @return 更新成功的分类数量
     */
    int updateCategory(Category category);

    /**
     * 删除分类
     *
     * @param categoryId 分类ID
     * @return 删除成功的分类数量
     */
    int deleteCategory(Long categoryId);
}
