package ru.fonin.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fonin.mvc.models.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    User findByLogin(String ашкы);

    Optional<User> findOneByLogin(String login);

//    User findById(Strin id);
}
