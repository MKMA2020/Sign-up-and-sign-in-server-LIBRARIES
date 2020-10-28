/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signable;

import exceptions.*;
import user_message.User;

/**
 *
 * @author 2dam
 */
public interface Signable {
    public User signIn(User user) throws PassNotCorrectException, UserNotFoundException;
   /* public void signUp(Message message);
    public void signOut(Message message);*/
    
}
