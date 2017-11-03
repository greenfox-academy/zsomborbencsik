package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.Posts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends CrudRepository<Posts,Integer> {

    @Query(value="SELECT * FROM post ORDER BY score DESC LIMIT 10 OFFSET ?1", nativeQuery = true)
    Iterable<Posts> getPostsByPage(int pageId);
}
