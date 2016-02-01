package com.springweb.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springweb.web.dao.RoleDAO;
import com.springweb.web.entity.Role;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
    private RoleDAO roleDAO;
     
    @Transactional
    public Role getRole(Integer id) {
        return roleDAO.getRole(id);
    }
    
    @Transactional
    public List<Role> listRole(){
    	return roleDAO.listRole();
    }
}
