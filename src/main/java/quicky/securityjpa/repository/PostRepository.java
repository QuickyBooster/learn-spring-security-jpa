package quicky.securityjpa.repository;

import org.springframework.data.repository.ListCrudRepository;
import quicky.securityjpa.model.Post;

public interface PostRepository extends ListCrudRepository<Post,Long> {

}
