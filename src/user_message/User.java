/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_message;

import java.security.Timestamp;



/**
 * This class contains the user object.
 * It will be sent inside a message to the server
 * and will be either added or checked with the db
 * @author Martin Gros
 */
public class User {


    private long id;
    private String login;
    private String email;
    private String fullName;
    private boolean status;
    private enum privilege{
        USER,
        ADMIN
    }
    private String password;
    private Timestamp lastAccess;
    private Timestamp lastPasswordChange;
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Timestamp lastAccess) {
        this.lastAccess = lastAccess;
    }

    public Timestamp getLastPasswordChange() {
        return lastPasswordChange;
    }

    public void setLastPasswordChange(Timestamp lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }
}




