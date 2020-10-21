/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signable;

import user_message.User;

/**
 *
 * @author 2dam
 */
public interface Signable {
    public void signIn(User user);
    public void signUp(User user);
    public void signOut();
    
}
