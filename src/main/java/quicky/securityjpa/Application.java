package quicky.securityjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import quicky.securityjpa.model.Post;
import quicky.securityjpa.model.User;
import quicky.securityjpa.repository.PostRepository;
import quicky.securityjpa.repository.UserRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PostRepository postRepository, UserRepository users , PasswordEncoder encoder) {
        return args -> {

            users.save(new User("abc", encoder.encode("abc"), "ROLE_USER"));
            users.save(new User("def", encoder.encode("def"), "ROLE_USER,ROLE_ADMIN"));
            postRepository.save(new Post("heello", "abc", "dkjfls", "neko"));
        };
    }
}
