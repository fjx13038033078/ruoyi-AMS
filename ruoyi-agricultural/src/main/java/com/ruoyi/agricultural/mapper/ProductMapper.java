package com.ruoyi.agricultural.mapper;

import com.ruoyi.agricultural.domain.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 10:12
 */
@Mapper
public interface ProductMapper {
    /**
     * 获取所有产品列表
     *
     * @return 产品列表
     */
    List<Product> getAllProducts();

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
     * @return 添加成功的产品数量
     */
    int addProduct(Product product);

    /**
     * 更新产品信息
     *
     * @param product 产品对象
     * @return 更新成功的产品数量
     */
    int updateProduct(Product product);

    /**
     * 删除产品
     *
     * @param productId 产品ID
     * @return 删除成功的产品数量
     */
    int deleteProduct(Long productId);

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
     * @return 用户的产品列表
     */
    List<Product> getProductsByUserId(Long userId);

    /**
     * 根据商户ID查询产品列表
     *
     * @param merchantId 商户ID
     * @return 商户的产品列表
     */
    List<Product> getProductByMerchantId(Long merchantId);
}
