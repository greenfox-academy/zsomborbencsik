package com.greenfox.reddit;

import com.greenfox.reddit.models.Posts;
import com.greenfox.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceProvider {

    @Bean
    public PostService postService() {
        return new PostService();
    }

}
