package com.example.webhooksolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebrookSolutionApplication {

    public static <WebhookService> void main(String[] args) {
        // Start the Spring application and get the application context
        ConfigurableApplicationContext context = SpringApplication.run(WebrookSolutionApplication.class, args);
        
        // Get the WebhookService bean and execute the webhook flow
        WebhookService webhookService = context.getBean(WebhookService.class);
        webhookService.executeWebhookFlow();
    }
}
