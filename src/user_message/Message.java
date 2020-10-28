/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_message;

import java.io.Serializable;

/**
 *
 * This class'll be used as the messsage object. 
 * Which will be sent across both apps 
 * in order to fullfill multiple tasks and report exceptions.
 * @author Martin Gros
 */
public class Message implements Serializable{
    
    private enum messageType{
        SIGNIN,
        SIGNUP
    }

   
    private User user;
    private String help;
    private messageType messageType;
    
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

    public messageType getMessageType() {
        return messageType;
    }
    /**
     * this method will receive an int which will be the kind of action that 
     * we will execute later on, in the server side.
    **/ 
    public void setMessageType(int num) {
        if (num == 1) 
            this.messageType = messageType.SIGNIN;
        else
            this.messageType = messageType.SIGNUP;
    }
    
    
    
    
}
