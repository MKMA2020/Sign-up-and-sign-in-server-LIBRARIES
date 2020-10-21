/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_message;

/**
 *
 * @author 2dam
 */
public class Message {

   
    private User user;
    private String help;
    private enum messageType{
        SIGNIN,
        SIGNUP
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }
    
    
}
