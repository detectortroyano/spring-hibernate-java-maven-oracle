package com.springweb.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.GenerationType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FUSERS")
public class User implements java.io.Serializable{
	
		private static final long serialVersionUID = 1L;
	
	 	@Id 
	    @SequenceGenerator(name = "IDFUSERS_SEQ_GENERADOR",allocationSize = 1, sequenceName = "IDFUSERS_SEQ")
		@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "IDFUSERS_SEQ_GENERADOR")//	 	@GeneratedValue
	 	@Column(name="ID", unique=true, nullable=false, precision=22, scale=0)	 	
	    private Integer id;
	     
	    @Column(name="NAME")
	    private String name;
	 
	    @Column(name="PASSWORD")
	    private String password;
    
	    @Column(name="USERKEY")
	    private String userKey;	  
	    
	    @Column(name="EMAIL", nullable = false)
	    private String email;	    
	    
	    @OneToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH,CascadeType.PERSIST})
	    @JoinTable(	name="FUSER_ROLES",  
			        joinColumns = {@JoinColumn(name="IDUSER", referencedColumnName="ID")},  
			        inverseJoinColumns = {@JoinColumn(name="IDROLE", referencedColumnName="ID")}
	    		  )
	    private Role role;  
	    
	    public Integer getId() {
	        return id;
	    }
	    public void setId(Integer id) {
	        this.id = id;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public String getPassword() {
	        return password;
	    }
	    
	    public void setPassword(String password) {
	        this.password = password;
	    }
    
	    public String getUserKey() {
	        return userKey;
	    }
	    
	    public void setUserKey(String userKey) {
	        this.userKey = userKey;
	    }
	    
	    public String getEmail() {
	        return email;
	    }
	    
	    public void setEmail(String email) {
	        this.email = email;
	    }		    
	    
	    public Role getRole(){
	    	return role;
	    }
	    
	    public void setRole(Role role){
	    	this.role=role;
	    }
	    
}