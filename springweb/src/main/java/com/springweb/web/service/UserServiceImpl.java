package com.springweb.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springweb.web.dao.UserDAO;
import com.springweb.web.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
    private UserDAO usuarioDAO;  
	
	@Transactional
    public User getUser(String login) {  
        return usuarioDAO.getUser(login);  
    } 
	
	@Transactional
	public User getUserById(Integer id){
		return usuarioDAO.getUserById(id);
	}
	
	@Transactional
	public void addUser(User usuario){
		usuarioDAO.addUser(usuario);
	}
	
	@Transactional
	public void editUser(User usuario){
		usuarioDAO.editUser(usuario);
	}
	
	@Transactional
	public void removeUser(Integer id){
		usuarioDAO.removeUser(id);
	}
	
	@Transactional
	public List<User> listUser(){
		return usuarioDAO.listUser();
	}
	
	@Transactional
	public User getUserByCondition(String condition){
		return usuarioDAO.getUserByCondition( condition );
	}
	
	@Transactional
	public List<User> listUserByCondition(String condition){
		return usuarioDAO.listUserByCondition( condition );
	}	
}
