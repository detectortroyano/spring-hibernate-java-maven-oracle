package com.springweb.web.dao;

import com.springweb.web.entity.User;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	public User getUser(String name) {
		List<User> listUser = new ArrayList<User>();
		Query query = sessionFactory.getCurrentSession().createQuery("from User u where u.name= :name");
		query.setParameter("name", name);
		listUser = query.list();
		if (listUser.size() > 0){
			return listUser.get(0);
		}else{
			return null;
		}
	}
	
	public User getUserById(Integer id){
		try{
			List<User> listUser= sessionFactory.getCurrentSession().createQuery("from User u where u.id="+id).list();
			if (listUser.size() > 0){
				return listUser.get(0);
			}else{
				return null;
			}
		}
		catch(Exception e){
			return null;
		}
	}
	
	public void addUser(User user){
		sessionFactory.getCurrentSession().save(user);
	}
	
	public void editUser(User user){
		sessionFactory.getCurrentSession().update(user);
	}
	
	public void removeUser(Integer id){
		User user=(User) sessionFactory.getCurrentSession().get(User.class,id);
		if(user!=null){
			sessionFactory.getCurrentSession().delete(user);
		}
	}
	
	public List<User> listUser(){
		List<User> listUser = new ArrayList<User>();
		listUser = sessionFactory.getCurrentSession().createQuery("from User").list();
		if (listUser.size() > 0){
			return listUser;
		}else{
			return null;
		}
	}
	
	public User getUserByCondition(String condition){
		try{
			String query = " from User u " + condition;
			List<User> listUser= sessionFactory.getCurrentSession().createQuery( query ).list();
			if (listUser.size() > 0){
				return listUser.get(0);
			}else{
				return null;
			}
		}
		catch(Exception e){
			return null;
		}
	}
	
	public List<User> listUserByCondition(String condition){
		try{
			String query = " from User u " + condition;
			List<User> listUser= sessionFactory.getCurrentSession().createQuery( query ).list();
			if (listUser.size() > 0){
				return listUser;
			}else{
				return null;
			}
		}
		catch(Exception e){
			return null;
		}
	}	

}
