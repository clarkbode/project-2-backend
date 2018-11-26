package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Post;
import com.revature.repos.PostRepo;

@Service
public class PostService {
	
	@Autowired
	private PostRepo pr;
	
	public List<Post> findAll() {
		return pr.findAll();
	}
	
	public Post findById(int id){
		return pr.getOne(id);
	}
	
	public Post save(Post p) {
		return pr.save(p);
	}

}
