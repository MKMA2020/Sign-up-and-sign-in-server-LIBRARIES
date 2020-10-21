/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception triggered by trying to log in as a user that doesn't exist.
 * @author Aitor Garcia
 */
public class UserNotFoundException extends SQLException{
    public UserNotFoundException(){
        final Logger LOG = Logger.getLogger("logger.Logger.log");
        LOG.log(Level.WARNING, "The user that was being searched wasn't found");
    }
}
