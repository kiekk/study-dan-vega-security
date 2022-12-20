package com.example.studydanvegasecurity;

import com.example.studydanvegasecurity.entity.Post;
import com.example.studydanvegasecurity.repository.PostRepository;
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
    CommandLineRunner commandLineRunner(PostRepository repository) {
        return args -> {
            repository.save(new Post("Hello World!", "hello-world", "Welcome to my blog!", "User"));
        };
    }
}
