import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Khaled Makkawirelang
 */
@ManagedBean(name= "value_login", eager=true)
@SessionScoped
public class login implements Serializable{

    /**
     * Creates a new instance of login
     */
    public String email,password;
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
            
            
    public String login() {
        String email = this.email;
        String password = this.password;
        if(email.equals("makkawirelang@gmail.com")&& password.equals("a"))
        {
            return "login_success";
        }
        else
        {
            return"login_failed";
        }
    }
}
