package ru.fonin.mvc.security.details;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.fonin.mvc.models.State;
import ru.fonin.mvc.models.User;

import java.util.Collection;
import java.util.Collections;

public class UserDetailsImpl implements UserDetails {

    private User user;



    public User getUser() {
        return user;
    }

    public UserDetailsImpl(User user) {
        this.user = user;
    }
    

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String userRole = user.getRole().toString();
        SimpleGrantedAuthority authority= new SimpleGrantedAuthority(userRole);
        return Collections.singleton(authority);
    }

    @Override
    public String getPassword() {
        return user.getHashPassword();
    }

    @Override
    public String getUsername() {
        return user.getLogin();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !user.getState().equals(State.BANNED);
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.getState().equals(State.ACTIVE);
    }
}
