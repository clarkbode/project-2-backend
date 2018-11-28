package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Like;

public interface LikeRepo extends JpaRepository<Like, Integer> {

}
