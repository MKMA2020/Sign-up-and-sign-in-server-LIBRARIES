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
 * Exeption triggered by trying to log in with an incorrect password.
 * @author Aitor Garcia
 */
public class PassNotCorrectException extends Exception{
    public PassNotCorrectException(){
        final Logger LOG = Logger.getLogger("exceptions.PassNotCorrectException.java");
        LOG.log(Level.WARNING, "User introduced the wrong password");
    }
}
