package com.springweb.web.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springweb.web.dao.UserDAO;
import com.springweb.web.system.WebUtil;

@Service
@Transactional(readOnly=true)
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserDAO usuarioDAO;	

	public UserDetails loadUserByUsername(String name)
			throws UsernameNotFoundException {		
		
		com.springweb.web.entity.User user=usuarioDAO.getUser(name);
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;

		return new User(
				user.getName(), 
				user.getPassword(), 
				enabled, 
				accountNonExpired, 
				credentialsNonExpired, 
				accountNonLocked,
				getAuthorities( user.getRole().getDescription() )
		);
	}
	
	public Collection<? extends GrantedAuthority> getAuthorities(String role) {
		List<String> roles= new ArrayList<String>();
		roles.add( role );
		List<GrantedAuthority> authList = getGrantedAuthorities( WebUtil.getRoles(role) );
		return authList;
	}
	
	public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();		
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}

}