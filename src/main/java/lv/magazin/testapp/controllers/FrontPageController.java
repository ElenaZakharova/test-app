package lv.magazin.testapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class FrontPageController {


    @RequestMapping(method = RequestMethod.GET, value = "/{categoryId}")
    public String getMainPage(Model model, @PathVariable Long categoryId) {
        model.addAttribute("categoryName", "Apartment");
        return "hello";
    }
}
