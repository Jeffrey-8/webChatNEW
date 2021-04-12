package ru.fonin.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.fonin.mvc.forms.UserForm;
import ru.fonin.mvc.services.RegistrationServiceImpl;
//import ru.fonin.mvc.service.UserService;

@Controller
public class RegistrationController
{


    @Autowired
    RegistrationServiceImpl registrationService;

    @GetMapping("/registration")
    public String redirectToRegistration(UserForm userForm){
        return "registration";
    }

    @PostMapping("/registration")
    public void registration(UserForm userForm){
        registrationService.registration(userForm);
        System.out.println("done!");
    }


}
