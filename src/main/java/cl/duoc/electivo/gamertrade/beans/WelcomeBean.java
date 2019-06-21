package cl.duoc.electivo.gamertrade.beans;

import javax.faces.bean.ManagedBean;

/**
 * @author tvaras
 * 21-06-2019
 */
@ManagedBean(name = "welcome", eager = true)
public class WelcomeBean {
    public WelcomeBean() {
        System.out.println("WelcomeBean instantiated");
    }
    public String getMessage() {
        return "I'm alive!";
    }
}