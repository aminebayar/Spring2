package com.amine.tvshows.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amine.tvshows.entities.Role;


public interface RoleRepository extends JpaRepository<Role, Long>  {

}