package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Like;
import com.revature.models.Post;
import com.revature.services.PostService;

@RestController
@RequestMapping(path = "posts")
public class PostController {
	
	@Autowired
	private PostService ps;
	
	@GetMapping
	public List<Post> findAll() {
		return ps.findAll();
	}
	
	@GetMapping("{id}")
	public Post findById(@PathVariable int id) {
		return ps.findById(id);
	}
	
	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Post save(@RequestBody Post p) {
		return ps.save(p);
	}
	
	@PostMapping("/like")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Post like(@RequestBody Like l) { // Clark: I think this is right?
		return ps.like(l);
	}
	
//	@PostMapping("/merge")
//	public Post merge(@RequestBody Post p) { //Clark: This is probably not going to work. Need to ask Blake about structure of custom functions
//		return ps.merge(p);
//	}

}
