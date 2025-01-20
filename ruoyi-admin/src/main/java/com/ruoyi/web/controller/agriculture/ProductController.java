package com.ruoyi.web.controller.agriculture;

import com.ruoyi.agricultural.domain.Product;
import com.ruoyi.agricultural.service.ProductService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 15:01
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/agricultural/product")
public class ProductController extends BaseController {
    private final ProductService productService;

    // 获取所有产品列表
    @GetMapping("/listAll")
    public TableDataInfo listAllProducts() {
        startPage();
        List<Product> allProducts = productService.getAllProducts();
        return getDataTable(allProducts);
    }

    // 根据分类ID获取产品列表
    @GetMapping("/listByCategory")
    public AjaxResult listProductsByCategoryId(@RequestParam Long categoryId) {
        return success(productService.getProductsByCategoryId(categoryId));
    }

    // 根据用户ID获取产品列表
    @GetMapping("/listByUser")
    public AjaxResult listProductsByUserId(@RequestParam Long userId) {
        return success(productService.getProductsByUserId(userId));
    }

    // 根据产品ID获取产品信息
    @GetMapping("/detail")
    public AjaxResult getProductById(@RequestParam Long productId) {
        return success(productService.getProductById(productId));
    }

    // 添加产品
    @PostMapping("/add")
    public AjaxResult addProduct(@RequestBody Product product) {
        return toAjax(productService.addProduct(product));
    }

    // 更新产品信息
    @PostMapping("/update")
    public AjaxResult updateProduct(@RequestBody Product product) {
        return toAjax(productService.updateProduct(product));
    }

    // 删除产品
    @PostMapping("/delete")
    public AjaxResult deleteProduct(@RequestParam Long productId) {
        return toAjax(productService.deleteProduct(productId));
    }
}
