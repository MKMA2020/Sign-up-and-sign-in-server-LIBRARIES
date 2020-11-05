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

    private static final long serialVersionUID = 8799656478674716638L;

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
     * This method gets the user's id.
     *
     * @return Returns the user id.
     */
    public long getId() {
        return id;
    }

    /**
     * This method sets the user id.
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * This method gets the user's login.
     *
     * @return Returns the user login.
     */
    public String getLogin() {
        return login;
    }

    /**
     * This method sets the user login.
     *
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * This method gets the user's email.
     *
     * @return Returns the user email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method sets the user's email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method gets the user's full name.
     *
     * @return Returns the user's name.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * This method sets the user's full name.
     *
     * @param fullName
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
     * This method gets the user's password
     *
     * @return Returns the user password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method sets the user's password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method gets the date in which the user last logged in.
     *
     * @return Returns the user lastAccess.
     */
    public Timestamp getLastAccess() {
        return lastAccess;
    }

    /**
     * This method sets the date in which the user last logged in.
     *
     * @param lastAccess
     */
    public void setLastAccess(Timestamp lastAccess) {
        this.lastAccess = lastAccess;
    }

    /**
     * It gets the date when the user changed its password.
     *
     * @return Returns the user lastPasswordChange.
     */
    public Timestamp getLastPasswordChange() {
        return lastPasswordChange;
    }

    /**
     * This method sets when the user's password has been changed.
     *
     * @param lastPasswordChange
     */
    public void setLastPasswordChange(Timestamp lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }
}
