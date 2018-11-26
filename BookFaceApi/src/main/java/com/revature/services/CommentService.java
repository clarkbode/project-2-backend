package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Comment;
import com.revature.repos.CommentRepo;

@Service
public class CommentService {

	@Autowired
	private CommentRepo cr;
	
	public List<Comment> findAll() {
		return cr.findAll();
	}
	
	public Comment findById(int id) {
		return cr.getOne(id);
	}
	
	public Comment save(Comment c) {
		return cr.save(c);
	}
}
