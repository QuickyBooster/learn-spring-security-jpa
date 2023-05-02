package quicky.securityjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import quicky.securityjpa.model.Post;
import quicky.securityjpa.repository.PostRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository postRepository){
		return args -> {
			postRepository.save(new Post("heello","abc","dkjfls","neko"));
		};
	}
}
