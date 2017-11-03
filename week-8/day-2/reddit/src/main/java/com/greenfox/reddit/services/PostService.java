package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Posts;
import com.greenfox.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public void downVote(int id) {
        postRepository.findOne(id).setScore(postRepository.findOne(id).getScore() -1);
        postRepository.save(postRepository.findOne(id));
    }

    public Posts findOne(int id) {
        return postRepository.findOne(id);
    }

    public Iterable<Posts> findAll() {
        return postRepository.findAll();
    }

    public Iterable<Posts> listAllPosts(int pageId) {
        return postRepository.getPostsByPage(pageId * 10);
    }
    public void save(Posts posts) {
        postRepository.save(posts);
    }
}
