package com.ruoyi.web.controller.agriculture;

import com.ruoyi.agricultural.domain.Category;
import com.ruoyi.agricultural.service.CategoryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import java.util.List;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 范佳兴
 * @date 2025/1/20 15:07
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/agricultural/category")
public class CategoryController extends BaseController {
    private final CategoryService categoryService;

    // 获取所有分类列表
    @GetMapping("/list")
    public TableDataInfo listCategories() {
        startPage();
        List<Category> categoryList = categoryService.getAllCategories();
        return getDataTable(categoryList);
    }

    // 根据分类ID查询分类信息
    @GetMapping("/detail")
    public AjaxResult getCategoryById(@RequestParam Long categoryId) {
        return success(categoryService.getCategoryById(categoryId));
    }

    // 添加分类
    @PostMapping("/add")
    public AjaxResult addCategory(@RequestBody Category category) {
        return toAjax(categoryService.addCategory(category));
    }

    // 更新分类信息
    @PostMapping("/update")
    public AjaxResult updateCategory(@RequestBody Category category) {
        return toAjax(categoryService.updateCategory(category));
    }

    // 删除分类
    @PostMapping("/delete")
    public AjaxResult deleteCategory(@RequestParam Long categoryId) {
        return toAjax(categoryService.deleteCategory(categoryId));
    }
}
