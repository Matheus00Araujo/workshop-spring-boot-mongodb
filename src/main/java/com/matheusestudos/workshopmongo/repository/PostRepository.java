package com.matheusestudos.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.matheusestudos.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
}
