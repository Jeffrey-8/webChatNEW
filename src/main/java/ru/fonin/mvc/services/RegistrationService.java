package ru.fonin.mvc.services;

import org.springframework.stereotype.Component;
//import ru.fonin.mvc.models.Role;
import ru.fonin.mvc.forms.UserForm;

@Component
public interface RegistrationService {
    void registration(UserForm userForm);
}


