package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exeption triggered by trying to log in with an incorrect password.
 *
 * @author Aitor Garcia
 */
public class PassNotCorrectException extends Exception {

    public PassNotCorrectException() {
        final Logger LOG = Logger.getLogger("exceptions.PassNotCorrectException.java");
        LOG.log(Level.WARNING, "User introduced the wrong password");
    }
}
