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
     * @return Returns the user of the message.
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user Sets the user on the message.
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return Returns the messageType of the message.
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * @param messageType Sets the messageType on the message.
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

}
