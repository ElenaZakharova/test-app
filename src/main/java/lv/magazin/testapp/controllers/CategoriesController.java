package lv.magazin.testapp.controllers;

import lv.magazin.testapp.domain.Category;
import lv.magazin.testapp.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by elena.zakharova on 21.10.2014.
 */
@Controller
public class CategoriesController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/category")
    public String getMainPage(Model model) {

        List<Category> categories = categoryService.getAll();
        if (categories == null) {
            return "404";
        }

        model.addAttribute("categories", categories);

        return "categories";
    }

}
