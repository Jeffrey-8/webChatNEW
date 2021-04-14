package ru.fonin.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.fonin.mvc.forms.UserForm;
//import ru.fonin.mvc.services.LoginServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {


    @RequestMapping(path="/login", method = RequestMethod.GET)
    public String getLoginPage(ModelAndView modelAndView,Authentication authentication, ModelMap modelMap, HttpServletRequest request)
    {
        if (authentication != null){
            return "redirect:/";
        }

        if (request.getParameterMap().containsKey("error")){
            modelMap.addAttribute("error",true);
        }

        return "login";
    }

}
