package com.example.studydanvegasecurity.controller.api.post;

import com.example.studydanvegasecurity.entity.Post;
import com.example.studydanvegasecurity.repository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostRepository repository;

    public PostController(PostRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Post> findAll() {
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Post findById(@PathVariable("id") Post post) {
        return post;
    }

}
