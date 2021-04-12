package ru.fonin.mvc.security.details;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.fonin.mvc.models.User;
import ru.fonin.mvc.repositories.UserRepository;

import java.util.Optional;




@Service
public class UserDetailsServiceImpl  implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional <User> userCondidate = userRepository.findByLogin(username);

        //41:57

        return null;
    }



}
