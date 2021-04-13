package ru.fonin.mvc.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.fonin.mvc.forms.UserForm;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;
//import ru.fonin.web.models.Role;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "login")
    private String login;

//    @Column(name ="password")
    private String hashPassword;

//    @Column(name = "first_name")
    private String firstName;

//    @Column(name = "last_name")
    private String lastName;


    @Enumerated( value = EnumType.STRING)
    private Role role;
    @Enumerated( value = EnumType.STRING)
    private State state;

    public static User from(UserForm form) {
        return User.builder()
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .build();
    }
}