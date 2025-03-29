package com.example.FullStack.pinggy.controller;

import com.example.FullStack.pinggy.config.AuthFilter;
import com.example.FullStack.pinggy.model.PostDTO;
import com.example.FullStack.pinggy.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/post")
    public ResponseEntity<String> createPost(@RequestBody PostDTO postDTO) {
        try{
            String authHeader = AuthFilter.getAuthHeader();
            postService.addPost(postDTO, authHeader);
            return ResponseEntity.ok("Post Saved Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Error saving post: " + e.getMessage());
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<?>> getPosts() {
        try{
            return ResponseEntity.ok(postService.getAllPosts());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(List.of("Error Retrieving Posts: " + e.getMessage()));
        }
    }

}
