package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception triggered by trying to log in as a user that doesn't exist.
 *
 * @author Aitor Garcia
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException() {
        final Logger LOG = Logger.getLogger("exceptions.UserNotFoundException.java");
        LOG.log(Level.WARNING, "The user that was being searched wasn't found");
    }
}
