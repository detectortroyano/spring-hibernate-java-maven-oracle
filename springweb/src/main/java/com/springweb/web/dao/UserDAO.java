package com.springweb.web.dao;

import com.springweb.web.entity.User;

import java.util.List;

public interface UserDAO {
public User getUser(String login);
public User getUserById(Integer id);
public void addUser(User user);
public void editUser(User user);
public void removeUser(Integer id);
public List<User> listUser();
public User getUserByCondition(String condition);
public List<User> listUserByCondition(String condition);
}
