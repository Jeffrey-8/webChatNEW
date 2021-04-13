package ru.fonin.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.fonin.mvc.repositories.UserRepository;
//import ru.fonin.mvc.dao.UserDao;
//import ru.fonin.mvc.forms.UserForm;
//import ru.fonin.mvc.models.User;

import java.util.Collections;
import java.util.List;
import java.util.Optional;


@Controller
public class UsersController {

//    @Autowired
//    private UserDao usersDao;
    @Autowired
    UserRepository userRepository;


    @RequestMapping(path = "/start", method = RequestMethod.GET)
    public ModelAndView start() {
        ModelAndView modelAndView= new ModelAndView("hello");
        return modelAndView;
//        return "redirect:/registration";
    }

//    @RequestMapping(path = "/hello", method = RequestMethod.GET)
//    public ModelAndView hello() {
//        ModelAndView modelAndView= new ModelAndView("hello");
//        return modelAndView;
////        return "redirect:/registration";
//    }


//    @RequestMapping(path="/auth", method = RequestMethod.POST)
//    public ModelAndView getLoginPage(){
//        ModelAndView modelAndView= new ModelAndView("auth");
//        return modelAndView;
//    }

}
