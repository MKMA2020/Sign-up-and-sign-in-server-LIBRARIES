/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception triggered by the server responding unexpectedly.
 * @author Aitor Garcia
 */
public class ServerErrorException extends Exception{
    public ServerErrorException(){
        final Logger LOG = Logger.getLogger("logger.Logger.log");
        LOG.log(Level.SEVERE, "Unexpected response from the server");
    }
}
