package com.springweb.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import java.util.Set;

import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FROLES")
public class Role implements java.io.Serializable{
	
		private static final long serialVersionUID = 1L;
	
	 	@Id
	    @SequenceGenerator(name = "IDFROLES_SEQ_GENERADOR",allocationSize = 1, sequenceName = "IDFROLES_SEQ")
		@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "IDFROLES_SEQ_GENERADOR")//	 	@GeneratedValue
	 	@Column(name="ID", unique=true, nullable=false, precision=22, scale=0)
	    private Integer id;
	     
	    @Column(name="ROLE")
	    private String description;
	    
	    @OneToMany(cascade=CascadeType.ALL)  
	    @JoinTable(name="FUSER_ROLES",   
	        joinColumns = {@JoinColumn(name="IDROLE", referencedColumnName="ID")},  
	        inverseJoinColumns = {@JoinColumn(name="IDUSER", referencedColumnName="ID")}  
	    )
	    private Set<User> userRoles;
	    
	    public Integer getId() {
	        return id;
	    }
	    public void setId(Integer id) {
	        this.id = id;
	    }
	    
	    public String getDescription() {
	        return description;
	    }
	    
	    public void setDescription(String description) {
	        this.description = description;
	    }
	    
	   public Set<User> getUserRoles(){
		   return userRoles;
	   }
	   
	   public void setUserRoles(Set<User> userRoles){
		   this.userRoles=userRoles;
	   }
}