//package ru.fonin.mvc.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//import ru.fonin.mvc.forms.UserForm;
//import ru.fonin.mvc.models.User;
//import ru.fonin.mvc.repositories.UserRepository;
//
//import java.util.Optional;
//
//@Component
//public class LoginServiceImpl implements LoginService{
//
//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    PasswordEncoder passwordEncoder;
//
//    @Override
//    public Boolean login(UserForm userForm) {
//        User user= userRepository.findByOneLogin(userForm.getLogin());
//        String newSTr=passwordEncoder.encode(userForm.getPassword());
//        String oldStr=user.getHashPassword();
//        if (user!=null){
//
//            if (passwordEncoder.matches(passwordEncoder.encode(userForm.getPassword()), user.getHashPassword()))
//            return true;
//        }
//        return false;
//    }
//}
