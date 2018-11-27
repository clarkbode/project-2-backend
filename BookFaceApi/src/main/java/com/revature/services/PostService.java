package com.revature.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Like;
import com.revature.models.Post;
import com.revature.repos.LikeRepo;
import com.revature.repos.PostRepo;

@Service
public class PostService {
	
	@Autowired
	private PostRepo pr;
	
	@Autowired
	private LikeRepo lr; //CREATE LIKEREPO
	
	public List<Post> findAll() {
		return pr.findAll();
	}
	
	public Post findById(int id){
		return pr.getOne(id);
	}
	
	public Post save(Post p) {
		return pr.save(p);
	}
	
	
	@Transactional
	public Post like(Like l) { 
		lr.save(l);
		// step 2: Get the post object pr.getOne(l.getPostID) (pseudocode)
		Post p = pr.getOne(l.getPostId());
		
		// change post likes value based by the value from the like
		if (l.getLikeValue())
		{
			p.setPost_likes(p.getPost_likes() + 1);
		}
		else
		{
			p.setPost_likes(p.getPost_likes() - 1);
		}
		
		//Clark: do we need to do pr.save(p)?
		
		return p;
		
	}

}
