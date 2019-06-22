package cl.duoc.electivo.gamertrade.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author tvaras
 * 21-06-2019
 */
@ManagedBean(name = "contact", eager = true)
@RequestScoped 
public class ContactBean implements Serializable {

	private static final long serialVersionUID = -6677824063731269091L;
	private String name;
	private String email;
	private String reason;
	private String message;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void submit() {
        String postValues = "Submitted values: " + name + ", " + email + ", " + reason + ", " + message;
        System.out.println(postValues);
    }
    
}
