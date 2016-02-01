package com.springweb.web.system;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.springweb.web.entity.User;

public final class WebUtil{

	public static String getUserNameFromPrincipal(){
		String userName = "";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if( principal instanceof UserDetails ){
			userName = ((UserDetails)principal).getUsername();
		}else if( principal instanceof User ){
			userName = principal.toString();
		}
		return userName;
	} 
	
	public static String getUserNameFromAuthentication(){
		String userName = "";
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		userName = auth.getName();
		return userName;
	}	
	
	public static boolean isRolePresent(Collection<GrantedAuthority> authorities, String role) {
		boolean isRolePresent = false;
		for (GrantedAuthority grantedAuthority : authorities) {
		isRolePresent = grantedAuthority.getAuthority().equals(role);
		if (isRolePresent) break;
		}
		return isRolePresent;
	}
	
	public static String getMainRole() {
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		String role = "";
		for (GrantedAuthority grantedAuthority : authorities) {
			role = grantedAuthority.getAuthority();
			break;
		}
		return role;
	}	
	
	public static List<String> getRoles(String role) {
		List<String> roles= new ArrayList<String>();
		if ( role.equals( System.ROLE_ADMIN_DB ) ) {
			roles.add("ROLE_ADMIN");
		}else if ( role.equals( System.ROLE_USER_DB ) ) {
			roles.add("ROLE_USER");
		}
		return roles;
	}	
	
}