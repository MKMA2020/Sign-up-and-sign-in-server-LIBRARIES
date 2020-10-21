/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception triggered by trying to create a user that already exists.
 * @author Aitor Garcia
 */
public class UserExistsException extends Exception{
    public UserExistsException(){
        final Logger LOG = Logger.getLogger("logger.Logger.log");
        LOG.log(Level.WARNING, "User being registered already exists");
    }
}
