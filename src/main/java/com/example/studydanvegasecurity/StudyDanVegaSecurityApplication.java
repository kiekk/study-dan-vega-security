package com.example.studydanvegasecurity;

import com.example.studydanvegasecurity.entity.Post;
import com.example.studydanvegasecurity.entity.User;
import com.example.studydanvegasecurity.repository.PostRepository;
import com.example.studydanvegasecurity.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudyDanVegaSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyDanVegaSecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PostRepository repository, UserRepository userRepository) {
        return args -> {
            userRepository.save(new User("user", "password", "ROLE_USER"));
            userRepository.save(new User("admin", "password", "ROLE_ADMIN"));
            repository.save(new Post("Hello World!", "hello-world", "Welcome to my blog!", "User"));
        };
    }
}
