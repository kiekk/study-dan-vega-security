package com.example.studydanvegasecurity.repository;

import com.example.studydanvegasecurity.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
}
