package lv.magazin.testapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Контроллер для страницы логина
 */
@Controller
public class LoginController {

        @RequestMapping(method = RequestMethod.GET,value = "/login")
        public String getMainPage(Model model) {

            return "login";
        }
    }
