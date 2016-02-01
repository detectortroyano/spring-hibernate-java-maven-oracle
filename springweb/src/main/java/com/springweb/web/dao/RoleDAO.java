package com.springweb.web.dao;

import java.util.List;

import com.springweb.web.entity.Role;

public interface RoleDAO {
	
	public Role getRole(Integer id);
	
	public List<Role> listRole();
	
}
