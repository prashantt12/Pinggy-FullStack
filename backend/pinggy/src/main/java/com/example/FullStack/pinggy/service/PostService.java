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
        try{
            posts.add(new PostResponseDTO(post.getTitle(), post.getBody(), authHeader));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<PostResponseDTO> getAllPosts() {
        try{
            return posts;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();   //returning an empty list on failure.
        }
    }

}
