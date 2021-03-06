package ru.fonin.mvc.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.fonin.mvc.security.details.UserDetailsImpl;
import ru.fonin.mvc.transfer.UserDto;

import javax.servlet.http.HttpServletRequest;

import static ru.fonin.mvc.transfer.UserDto.from;

@Controller
public class ProfileController {

    @GetMapping("/")
    public String getProfilePage(Authentication authentication, ModelMap model, HttpServletRequest request)
    {

        if (request.getParameterMap().containsKey("error")){
            model.addAttribute("error",true);
        }

        if (authentication == null){
            return "redirect:/login";
        }



        UserDetailsImpl details =(UserDetailsImpl)authentication.getPrincipal();
        UserDto user = from(details.getUser());
        model.addAttribute("user",user);
        return "afterLogin";
    }
}
