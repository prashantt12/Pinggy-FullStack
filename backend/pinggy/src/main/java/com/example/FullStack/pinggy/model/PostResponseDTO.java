package com.example.FullStack.pinggy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostResponseDTO {
    private String title;
    private String body;
    private String authHeader;
}
