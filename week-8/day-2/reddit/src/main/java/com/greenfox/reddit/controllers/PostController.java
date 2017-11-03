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
    PostService postService;

    @PostMapping("/posts/update")
    public String updateEntry(@ModelAttribute Posts post){
        postRepository.save(post);
        return "redirect:/posts/";
    }

    @RequestMapping("/posts/")
    public String listPosts(Model model) {
        model.addAttribute("listPosts", postService.findAll());
        return "posts";
    }
    @GetMapping("/posts/upvote/{id}")
    public String upvote(@PathVariable int id, Model model){
        model.addAttribute("editedPost", postRepository.findOne(id));
        postRepository.findOne(id).setScore(postRepository.findOne(id).getScore() +1);
        postRepository.save(postRepository.findOne(id));
        return "redirect:/posts/";
    }
    @GetMapping("/posts/downvote/{id}")
    public String downvote(@PathVariable int id, Model model){
        model.addAttribute("editedPost", postService.findOne(id));
        postService.downVote(id);
        return "redirect:/posts/";
    }
    @GetMapping("/posts/add")
    public String addPost(Model model) {
    model.addAttribute("emptyPost", new Posts());
    return "add";
    }
    @GetMapping({"", "/posts/"})
    public String listAllPosts(@RequestParam(value = "pageId", defaultValue = "0") int pageId, Model model) {
        model.addAttribute("posts", postService.listAllPosts(pageId));
        model.addAttribute("pageId", pageId);
        return "posts";
    }


}
