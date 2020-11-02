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
     * 
     * @param user
     * @return
     * @throws DataBaseConnectionException
     * @throws PassNotCorrectException
     * @throws ServerErrorException
     * @throws TimeOutException
     * @throws UserNotFoundException 
     */
    public User signIn(User user) throws DataBaseConnectionException,
                                         PassNotCorrectException,
                                         ServerErrorException,
                                         TimeOutException,
                                         UserNotFoundException;
    /**
     * 
     * @param user
     * @return
     * @throws DataBaseConnectionException
     * @throws ServerErrorException
     * @throws TimeOutException
     * @throws UserExistsException 
     */
    public User signUp(User user) throws DataBaseConnectionException,
                                         ServerErrorException,
                                         TimeOutException,
                                         UserExistsException;
    /**
     * 
     * @param user
     * @return 
     */
    public User signOut(User user);

}
