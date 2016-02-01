package com.springweb.web.service;

import java.util.List;

import com.springweb.web.entity.Role;

public interface RoleService {
	
	public Role getRole(Integer id);
	
	public List<Role> listRole();
}
