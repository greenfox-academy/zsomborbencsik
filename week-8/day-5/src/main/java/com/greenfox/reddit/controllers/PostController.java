package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.Posts;
import com.greenfox.reddit.repositories.PostRepository;
import com.greenfox.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostService postService;


    @RequestMapping("/posts/")
    public String listPosts(Model model) {
        model.addAttribute("listPosts", postRepository.findAll());
        return "posts";
    }




}
