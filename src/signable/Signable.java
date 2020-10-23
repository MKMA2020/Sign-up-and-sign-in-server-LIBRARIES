/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signable;

import user_message.Message;

/**
 *
 * @author 2dam
 */
public interface Signable {
    public void signIn(Message message);
    public void signUp(Message message);
    public void signOut(Message message);
    
}
