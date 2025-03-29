package com.example.FullStack.pinggy.service;

import com.example.FullStack.pinggy.model.PostDTO;
import com.example.FullStack.pinggy.model.PostResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private final List<PostResponseDTO> posts = new ArrayList<>();

    public void addPost(PostDTO post, String authHeader) {
        posts.add(new PostResponseDTO(post.getTitle(), post.getBody(), authHeader));
        System.out.println("Post added: " + post.getTitle() + " | Header: " + authHeader);
    }

    public List<PostResponseDTO> getAllPosts() {
        System.out.println("Fetching all posts...");
        return new ArrayList<>(posts);
    }
}
