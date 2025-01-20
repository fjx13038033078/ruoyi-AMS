package com.ruoyi.web.controller.agriculture;

import com.ruoyi.agricultural.domain.Cart;
import com.ruoyi.agricultural.service.CartService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/1/20 15:05
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/agricultural/cart")
public class CartController extends BaseController {

    private final CartService cartService;

    // 获取用户的购物车列表
    @GetMapping("/list")
    public TableDataInfo listCartByUserId(@RequestParam Long userId) {
        startPage();
        List<Cart> cartList = cartService.getCartByUserId(userId);
        return getDataTable(cartList);
    }

    // 根据购物车ID查询购物车信息
    @GetMapping("/detail")
    public AjaxResult getCartById(@RequestParam Long cartId) {
        return success(cartService.getCartById(cartId));
    }

    // 添加商品到购物车
    @PostMapping("/add")
    public AjaxResult addToCart(@RequestBody Cart cart) {
        return toAjax(cartService.addToCart(cart));
    }

    // 从购物车删除商品
    @PostMapping("/remove")
    public AjaxResult removeFromCart(@RequestParam Long cartId) {
        return toAjax(cartService.removeFromCart(cartId));
    }

    // 删除用户购物车中的所有商品
    @PostMapping("/clear")
    public AjaxResult clearCart(@RequestParam Long userId) {
        return toAjax(cartService.clearCart(userId));
    }
}
