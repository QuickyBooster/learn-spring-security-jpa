package quicky.securityjpa.repository;

import org.springframework.data.repository.ListCrudRepository;
import quicky.securityjpa.model.User;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends ListCrudRepository<User,Long> {

    Optional<User> findByUsername(String username);
}
