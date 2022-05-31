package com.amine.tvshows.service;

import java.util.List;

import com.amine.tvshows.entities.Role;

public interface RoleService {
	 List <Role> findAll();
	    
	 Role saveRole(Role r);
	 Role updateRole(Role r);
	     Role getRole (Long idRole);
}