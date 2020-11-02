package user_message;

import java.io.Serializable;
import java.security.Timestamp;

/**
 * User class will be used as a part of the Message that will be sent between
 * Server and Client.
 *
 * @author Martin Gros
 */
public class User implements Serializable {

    private long id;
    private String login;
    private String email;
    private String fullName;
    private boolean status;
    private String password;
    private Timestamp lastAccess;
    private Timestamp lastPasswordChange;

    private enum privilege {
        USER,
        ADMIN
    }

    /**
     * @return Returns the user id.
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @param id Sets the user id.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return Returns the user login.
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login Sets the user login.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return Returns the user email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email Sets the user email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return Returns the user fullName.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName Sets the user fullName.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Boolean user status will be true when the user is active and false when
     * is inactive.
     *
     * @return Returns the user status.
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Boolean user status will be true when the user is active and false when
     * is inactive.
     *
     * @param status Sets the user status.
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return Returns the user password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password Sets the user password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return Returns the user lastAccess.
     */
    public Timestamp getLastAccess() {
        return lastAccess;
    }

    /**
     * @param lastAccess Sets the user lastAccess.
     */
    public void setLastAccess(Timestamp lastAccess) {
        this.lastAccess = lastAccess;
    }

    /**
     * @return Returns the user lastPasswordChange.
     */
    public Timestamp getLastPasswordChange() {
        return lastPasswordChange;
    }

    /**
     * @param lastPasswordChange Sets the user lastPasswordChange.
     */
    public void setLastPasswordChange(Timestamp lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }
}
