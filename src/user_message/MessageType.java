package user_message;

/**
 * MessageType class will contain the enum that specifies the options of
 * messageType for the Message Class.
 *
 * @author Martin Gros
 */
public enum MessageType {
    SIGNIN,
    SIGNUP,
    USEREXISTS,
    USERNOTFOUND,
    PASSNOTCORRECT,
    DATABASEERROR,
    TIMEOUTEXCEPTION,
    SERVERERROR,
    OKAY;
}
