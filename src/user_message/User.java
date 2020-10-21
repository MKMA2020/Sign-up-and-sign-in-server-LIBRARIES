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
    
    /**
     * 
     * @return This method will return the User ID long.
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    /**
     * 
     * @return This method will return the Username login String.
     */
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    /**
     * 
     * @return This method will return the User Email String.
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * 
     * @return This method will return the full name of the user as a String.
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    /**
     * 
     * @return This method will return wheter the User status is true or false (True will mean the user is active and False will mean user is inactive).
     */
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    /**
     * 
     * @return This method will return the User password as a String.
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 
     * @return This method will return the Last Access of the User as a Timestamp.
     */
    public Timestamp getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Timestamp lastAccess) {
        this.lastAccess = lastAccess;
    }
    /**
     * 
     * @return This method will return the last Password Change of the User as a Timestamp.
     */
    public Timestamp getLastPasswordChange() {
        return lastPasswordChange;
    }

    public void setLastPasswordChange(Timestamp lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }
}




