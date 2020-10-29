/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signable;

import exceptions.*;
import user_message.User;

/**
 * The interface containing the sign-up,
 * sign-in and sign-out methods.
 * @author Martin Gros 
 */
public interface Signable {
    public User signIn(User user) throws DataBaseConnectionException, PassNotCorrectException, ServerErrorException, TimeOutException, UserNotFoundException;
    public User signUp(User user)throws DataBaseConnectionException, ServerErrorException, TimeOutException, UserExistsException;
    public User signOut(User user);
    
}
