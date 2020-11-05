package signable;

import exceptions.*;
import user_message.User;

/**
 * Signable interface will declare SignIn, SignUp and SignOut methods that will
 * be used in the Server and Client side of the App.
 *
 * @author Martin Gros
 */
public interface Signable {

    /**
     * This method receives an user and tries to log it into the database.
     *
     * @param user that will be signed into the app.
     * @return the user that has signed in.
     * @throws DataBaseConnectionException when there is an error with the
     * database.
     * @throws PassNotCorrectException when the password is incorrect.
     * @throws ServerErrorException when the server has an unexpected error.
     * @throws TimeOutException when the server doesn't answer in time.
     * @throws UserNotFoundException when the user does not exist.
     */
    public User signIn(User user) throws DataBaseConnectionException,
            PassNotCorrectException,
            ServerErrorException,
            TimeOutException,
            UserNotFoundException;

    /**
     * This method receives an user and tries to register it into the database.
     *
     * @param user that will be registered in the database.
     * @return the user that has been registered.
     * @throws DataBaseConnectionException when there is an error with the
     * database.
     * @throws ServerErrorException when the server has an unexpected error.
     * @throws TimeOutException when the server doesn't answer in time.
     * @throws UserExistsException when the user introduced already exists.
     */
    public User signUp(User user) throws DataBaseConnectionException,
            ServerErrorException,
            TimeOutException,
            UserExistsException;

    /**
     * This method would log the user out of the app (unimplemented).
     *
     * @param user that would log out of the app.
     * @return the user that has logged out.
     */
    public User signOut(User user);

}
