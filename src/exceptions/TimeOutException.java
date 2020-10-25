/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception triggered by the server not responding within a specified time window.
 * @author Aitor Garcia
 */
public class TimeOutException extends Exception{
    public TimeOutException(){
        final Logger LOG = Logger.getLogger("exceptions.TimeOutException.java");
        LOG.log(Level.SEVERE, "Server didn't respond in time");
    }
}
