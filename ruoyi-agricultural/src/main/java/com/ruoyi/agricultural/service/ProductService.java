package com.ruoyi.agricultural.service;

import com.ruoyi.agricultural.domain.Product;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 11:04
 */
public interface ProductService {
    /**
     * 获取所有产品列表
     *
     * @return 产品列表
     */
    List<Product> getAllProducts();

    /**
     * 根据分类ID查询产品列表
     *
     * @param categoryId 分类ID
     * @return 产品列表
     */
    List<Product> getProductsByCategoryId(Long categoryId);

    /**
     * 根据用户ID查询产品列表
     *
     * @param userId 用户ID
     * @return 产品列表
     */
    List<Product> getProductsByUserId(Long userId);

    /**
     * 根据产品ID查询产品信息
     *
     * @param productId 产品ID
     * @return 产品对象
     */
    Product getProductById(Long productId);

    /**
     * 添加产品
     *
     * @param product 产品对象
     * @return 添加成功返回 true，否则返回 false
     */
    boolean addProduct(Product product);

    /**
     * 更新产品信息
     *
     * @param product 产品对象
     * @return 更新成功返回 true，否则返回 false
     */
    boolean updateProduct(Product product);

    /**
     * 删除产品
     *
     * @param productId 产品ID
     * @return 删除成功返回 true，否则返回 false
     */
    boolean deleteProduct(Long productId);
}
