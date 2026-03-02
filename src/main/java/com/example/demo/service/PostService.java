package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    public Post[] listAllPosts() {
        Post post1 = new Post("Post 1", 123);
        Post post2 = new Post("Post 2", 456);
        Post post3 = new Post("Post 3", 789);
        return new Post[]{post1, post2, post3};
    }
}
