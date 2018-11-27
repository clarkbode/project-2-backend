package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Friend;
import com.revature.services.FriendService;

@RestController
@RequestMapping(path = "friends")

public class FriendController {

	@Autowired
	private FriendService fs;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Friend saveFriend(@RequestBody Friend friend) {
		return fs.saveFriend(friend);
	}
}
