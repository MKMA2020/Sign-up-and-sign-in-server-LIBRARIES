package user_message;

import java.io.Serializable;

/**
 * Message class will contain the message object that is sent between the Server
 * and Client side of the app.
 *
 * @author Martin Gros
 */
public class Message implements Serializable {

    private User user;
    private MessageType messageType;

    /**
     * Class Constructor to create a Message.
     *
     * @param user from the User class.
     * @param messageType from the enum MessageType.
     */
    public Message(User user, MessageType messageType) {
        this.user = user;
        this.messageType = messageType;
    }

    /**
     * This method gets the user that the message contains
     * @return Returns the user of the message.
     */
    public User getUser() {
        return user;
    }

    /**
     * This method sets an user in the message
     * @param user 
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * This method gets the type of the message
     * @return Returns the type of the message.
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * This method sets the type of the message
     * @param messageType 
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

}

