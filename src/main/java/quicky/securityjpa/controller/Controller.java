package quicky.securityjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import quicky.securityjpa.model.Post;
import quicky.securityjpa.repository.PostRepository;

@RestController
@RequestMapping("/api/posts")
public class Controller {
    private final PostRepository repository;

    public Controller(PostRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public Iterable<Post> findAll(){
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Post findById(@PathVariable("id") Post post){
        return post;
    }
}
