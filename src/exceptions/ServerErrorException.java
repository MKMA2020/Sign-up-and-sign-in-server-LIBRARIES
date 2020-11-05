package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception triggered by the server responding unexpectedly.
 *
 * @author Aitor Garcia
 */
public class ServerErrorException extends Exception {

    public ServerErrorException() {
        final Logger LOG = Logger.getLogger("exceptions.ServerErrorException.java");
        LOG.log(Level.SEVERE, "Unexpected response from the server");
    }
}
