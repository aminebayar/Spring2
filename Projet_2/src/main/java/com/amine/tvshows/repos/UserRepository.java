package com.amine.tvshows.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amine.tvshows.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}