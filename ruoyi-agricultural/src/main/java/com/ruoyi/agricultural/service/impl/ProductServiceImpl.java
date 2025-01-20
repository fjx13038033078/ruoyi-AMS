package com.ruoyi.agricultural.service.impl;

import com.ruoyi.agricultural.domain.Product;
import com.ruoyi.agricultural.mapper.ProductMapper;
import com.ruoyi.agricultural.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 11:05
 */
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    /**
     * 获取所有产品列表
     *
     * @return 产品列表
     */
    @Override
    public List<Product> getAllProducts() {
        return productMapper.getAllProducts();
    }

    /**
     * 根据分类ID查询产品列表
     *
     * @param categoryId 分类ID
     * @return 产品列表
     */
    @Override
    public List<Product> getProductsByCategoryId(Long categoryId) {
        return productMapper.getProductsByCategoryId(categoryId);
    }

    /**
     * 根据用户ID查询产品列表
     *
     * @param userId 用户ID
     * @return 产品列表
     */
    @Override
    public List<Product> getProductsByUserId(Long userId) {
        return productMapper.getProductsByUserId(userId);
    }

    /**
     * 根据产品ID查询产品信息
     *
     * @param productId 产品ID
     * @return 产品对象
     */
    @Override
    public Product getProductById(Long productId) {
        return productMapper.getProductById(productId);
    }

    /**
     * 添加产品
     *
     * @param product 产品对象
     * @return 添加成功返回 true，否则返回 false
     */
    @Override
    public boolean addProduct(Product product) {
        int rows = productMapper.addProduct(product);
        return rows > 0;
    }

    /**
     * 更新产品信息
     *
     * @param product 产品对象
     * @return 更新成功返回 true，否则返回 false
     */
    @Override
    public boolean updateProduct(Product product) {
        int rows = productMapper.updateProduct(product);
        return rows > 0;
    }

    /**
     * 删除产品
     *
     * @param productId 产品ID
     * @return 删除成功返回 true，否则返回 false
     */
    @Override
    public boolean deleteProduct(Long productId) {
        int rows = productMapper.deleteProduct(productId);
        return rows > 0;
    }
}
