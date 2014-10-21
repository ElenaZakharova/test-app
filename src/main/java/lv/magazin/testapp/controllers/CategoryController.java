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

import java.util.List;

/**
 * Created by elena.zakharova on 20.10.2014.
 */
@Controller
public class CategoryController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/category/{categoryId}")
    public String getMainPage(Model model, @PathVariable Long categoryId) {
        List<Product> products = productService.getAllByCategory(categoryId);
        if (products == null) {
            return "404";
        }
        Category category = categoryService.getCategoryById(categoryId);
        if (category == null) {
            return "404";
        }
        model.addAttribute("categoryId",category.getCategoryId());
        model.addAttribute("categoryName",category.getCategoryName());
        model.addAttribute("products",products);

        return "category";

    }
}
