package com.example.webhooksolution.dto;

import lombok.Data;

@Data
public class SubmitSolutionRequest {
    private String finalQuery;
    
    public SubmitSolutionRequest(String finalQuery) {
        this.finalQuery = finalQuery;
    }
}