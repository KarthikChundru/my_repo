package com.blog.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blog.dto.Blog;
import com.blog.entity.BlogDocument;

public interface BlogRepo extends MongoRepository<BlogDocument, Integer> {

}

