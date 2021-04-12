package ru.fonin.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.fonin.mvc.forms.UserForm;
import ru.fonin.mvc.services.LoginServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping(path="/login", method = RequestMethod.GET)
    public ModelAndView authorization(ModelMap modelMap, HttpServletRequest request){

        ModelAndView modelAndView= new ModelAndView("auth");
        if (request.getParameterMap().containsKey("error")){
            modelAndView.addObject("error",true);
        }

        return modelAndView;
    }

    @PostMapping("/loginn")
    public ModelAndView checkAuthorization( UserForm userForm){
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("auth");
        if (loginService.login(userForm)){
            modelAndView.addObject("error",false);
            modelAndView.setViewName("hello");
        }
        modelAndView.addObject("error",true);
        return modelAndView;
    }
}
