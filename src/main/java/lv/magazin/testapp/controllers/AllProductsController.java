package lv.magazin.testapp.controllers;

import lv.magazin.testapp.domain.Category;
import lv.magazin.testapp.domain.Product;
import lv.magazin.testapp.services.CategoryService;
import lv.magazin.testapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by elena.zakharova on 21.10.2014.
 */
@Controller
public class AllProductsController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/products")
    public String getMainPage(Model model) {

        List<Product> allproducts = productService.getAllProducts();
        if (allproducts == null) {
            return "404";
        }


        model.addAttribute("allproducts", allproducts);

        return "allproducts";
    }
}
