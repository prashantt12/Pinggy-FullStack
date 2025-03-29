package com.example.FullStack.pinggy.controller;

import com.example.FullStack.pinggy.config.AuthFilter;
import com.example.FullStack.pinggy.model.PostDTO;
import com.example.FullStack.pinggy.model.PostResponseDTO;
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
    public ResponseEntity<String> createPost(@RequestBody PostDTO postDTO, @RequestHeader(value = "PinggyAuthHeader", required = false) String authHeader) {

        if (authHeader == null || authHeader.isEmpty()){
            return ResponseEntity.status(401).body("Unauthorized: Missing or empty PinggyAuthHeader.");
        }

        try{
            postService.addPost(postDTO, authHeader);
            return ResponseEntity.ok("Post Saved Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Error saving post: " + e.getMessage());
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<PostResponseDTO>> getPosts(@RequestHeader(value = "PinggyAuthHeader", required = false) String authHeader) {

        System.out.println("GET Header: " + authHeader);

        if (authHeader == null || authHeader.isEmpty()) {
            return ResponseEntity.status(401).body(List.of(new PostResponseDTO("Unauthorized", "Missing or invalid header", "")));
        }

        try{
            List<PostResponseDTO> posts = postService.getAllPosts();
            if (posts.isEmpty()) {
                return ResponseEntity.ok(List.of(new PostResponseDTO("No Posts", "No Posts Available", "")));
            }
            return ResponseEntity.ok(posts);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(List.of(new PostResponseDTO("Error", "Failed to fetch posts", "")));
        }
    }

}
