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
 * Exception triggered by getting an error while trying to update(In the database) the last access(To the application).
 * @author Aitor Garcia
 */
public class LastAccessException extends Exception{
    public LastAccessException(){
        final Logger LOG = Logger.getLogger("exceptions.LastAccessException.java");
        LOG.log(Level.SEVERE, "There was an error attempting to update the last time someone logged in");
    }
}
