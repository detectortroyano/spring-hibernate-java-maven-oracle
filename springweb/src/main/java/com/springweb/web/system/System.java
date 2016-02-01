package com.springweb.web.system;

import java.io.IOException;
import java.util.Properties;

import org.commons.util.LoggerFacUtil;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public abstract class System {

	private static Resource resource;
	private static Properties properties;
	static {
		try {
			resource = new ClassPathResource("../config/smtp/smtp.mail.springweb.properties");
			properties = PropertiesLoaderUtils.loadProperties(resource);			
		} catch (IOException e) {
			LoggerFacUtil.error("System", e, e.getMessage());
		}
	}
	
	//Constantes para Datos del Sistema
	public static final String AMBIENTE_TIPO_SISTEMA	="DESARROLLO";		
	public static final String AMBIENTE_DB_MYSQL		="mysql";
	public static final String AMBIENTE_DB_ORACLE		="oracle";
	public static final String VERSION_SISTEMA			= "0.5";		
	
	public static String ROLE_ADMIN 							= "ROLE_ADMIN";
	public static String ROLE_USER 								= "ROLE_USER";
	public static String ROLE_ADMIN_DB 							= "ADMIN";
	public static String ROLE_USER_DB 							= "USER";
	
	//Constantes para Envio de Correo		
	public static String SMTP_HOST_NAME		= (String) properties.get("smtp.hostname");
	public static String SMTP_ADDRESS		= (String) properties.get("smtp.address");
	public static String SMTP_USER			= (String) properties.get("smtp.user");
	public static String SMTP_PASSWORD		= (String) properties.get("smtp.password");
	public static String SMTP_PORT  		= (String) properties.get("smtp.port");
	public static String SMTP_SECURITY		= (String) properties.get("smtp.security");
	
}
