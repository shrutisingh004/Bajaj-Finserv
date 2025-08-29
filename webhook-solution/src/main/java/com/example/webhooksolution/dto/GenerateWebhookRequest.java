package com.example.webhooksolution.dto;

import lombok.Data;

@Data
public class GenerateWebhookRequest {
    private String name;
    private String regNo;
    private String email;
    
    public GenerateWebhookRequest() {
        this.name = "John Doe";
        this.regNo = "REG12347";
        this.email = "john@example.com";
    }
}