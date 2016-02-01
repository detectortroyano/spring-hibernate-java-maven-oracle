package com.springweb.web.dao;

import java.util.List;

import com.springweb.web.entity.Role;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDAOImpl implements RoleDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Role getRole(Integer id) {
		Role role = (Role) sessionFactory.getCurrentSession().load(Role.class, id);
		return role;
	}
	
	public List<Role> listRole() {
		return sessionFactory.getCurrentSession().createQuery("from Role")
				.list();
	}	
}
