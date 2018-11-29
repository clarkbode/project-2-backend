SET SCHEMA 'project_2';

CREATE TABLE users (
	user_id SERIAL PRIMARY KEY,
	user_username UNIQUE TEXT,
	user_password TEXT,
	first_name TEXT,
	last_name TEXT
);


CREATE TABLE comments (
	comment_id SERIAL PRIMARY KEY,
	comment_body TEXT,
	comment_likes INTEGER, 
	comment_author INTEGER,
	post_id INTEGER REFERENCES posts(post_id),
	
	FOREIGN KEY (comment_author) REFERENCES users(user_id)
);

CREATE TABLE posts (
	post_id SERIAL PRIMARY KEY,
	author_id INTEGER,
	post_body TEXT,
	post_image TEXT,
	post_likes INTEGER,
	post_comments INTEGER,
	
	FOREIGN KEY (author_id) REFERENCES users(user_id),
	
	FOREIGN KEY (post_comments) REFERENCES comments(comment_id)
);

CREATE TABLE profiles (
	profile_id SERIAL PRIMARY KEY,
	author_id INTEGER, 
	author_birthdate TIMESTAMP,
	profile_image TEXT,
	profile_description TEXT,
	
	FOREIGN KEY (author_id) REFERENCES users(user_id)
);

CREATE TABLE friends (
	user_id INTEGER,
	friend_id INTEGER,
	CONSTRAINT pk_users_friends PRIMARY KEY (user_id, friend_id)
);

CREATE TABLE post_likes (
	like_id SERIAL PRIMARY KEY,
	post_id INTEGER REFERENCES posts(post_id),
	like_value BOOLEAN
)