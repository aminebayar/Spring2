package com.amine.tvshows.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amine.tvshows.entities.Role;
import com.amine.tvshows.repos.RoleRepository;


@Service
public class RoleServiceImpl implements RoleService {
	 @Autowired
	    private RoleRepository roleRepository;

	    @Override
	    public List <Role> findAll() {
	        return roleRepository.findAll();
	    }

		@Override
		public Role saveRole(Role r) {
			return roleRepository.save(r);
		}

		@Override
		public Role updateRole(Role c) {
			return roleRepository.save(c);
		}


		@Override
		public Role getRole(Long idRole) {
			return roleRepository.findById(idRole).get();
		}
}