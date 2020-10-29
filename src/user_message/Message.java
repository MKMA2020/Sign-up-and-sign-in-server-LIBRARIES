/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_message;

import java.io.Serializable;

/**
 *
 * This class'll be used as the messsage object. Which will be sent across both
 * apps in order to fullfill multiple tasks and report exceptions.
 *
 * @author Martin Gros
 */
public class Message implements Serializable {

    public Message(User user, MessageType messageType) {
        this.user = user;
        this.messageType = messageType;
    }
    
    

   

    private User user;
    private String help;
    private MessageType messageType;

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

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    

}
