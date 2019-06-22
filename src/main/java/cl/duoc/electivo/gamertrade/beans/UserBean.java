package cl.duoc.electivo.gamertrade.beans;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 * @author tvaras
 * 21-06-2019
 */
@ManagedBean(name="user", eager=true)
@SessionScoped
public class UserBean implements Serializable {

	private static final long serialVersionUID = 3989346557858640045L;
	private Long id;
	private String name;
	private String surname;
	private String username;
	private String password;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//TODO enganchar a ws o capa de negocio
	public void login() throws IOException {
		
		System.out.println("posted values: " + username + ", " + password);
		
		
//		return "index";
		FacesContext.getCurrentInstance().getExternalContext().redirect("index.jsf");
	}
}
