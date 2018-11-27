package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Friend;
import com.revature.repos.FriendRepo;

@Service
public class FriendService {
	
	@Autowired
	private FriendRepo friendRepo;
	
	public Friend saveFriend(Friend u) {
		return friendRepo.save(u);
	}
	
}
