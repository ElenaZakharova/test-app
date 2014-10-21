package lv.magazin.testapp.controllers;

import lv.magazin.testapp.domain.Category;
import lv.magazin.testapp.domain.Product;
import lv.magazin.testapp.services.CategoryService;
import lv.magazin.testapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by elena.zakharova on 20.10.2014.
 */

@Controller
public class ProductsController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/category/{categoryId}/product/{productId}")
    public String getMainPage(Model model, @PathVariable Long categoryId, @PathVariable Long productId) {

        Category category = categoryService.getCategoryById(categoryId);
        if (category == null) {
            return "404";
        }
        model.addAttribute("category",category.getCategoryName());

        Product product = productService.getProductById(productId);
        if (product == null) {
            return "404";
        }
        model.addAttribute("productPrice", product.getProductPrice());
        model.addAttribute("productName", product.getProductName());
        model.addAttribute("categoryId", product.getCategoryId());
        return "product";
    }
}
