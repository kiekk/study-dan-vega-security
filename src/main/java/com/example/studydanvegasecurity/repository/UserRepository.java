package com.example.studydanvegasecurity.repository;

import com.example.studydanvegasecurity.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
