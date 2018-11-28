package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {
	
	//Post merge(Post p); //Clark: Not sure if this works like this

}
