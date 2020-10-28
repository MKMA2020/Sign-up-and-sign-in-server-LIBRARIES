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
 * Exception triggered by failing to connect to the database.
 * @author Aitor Garcia
 */
public class DataBaseConnectionException extends SQLException{
    public DataBaseConnectionException(){
        final Logger LOG = Logger.getLogger("exceptions.DataBaseConnectionException.java");
        LOG.log(Level.SEVERE, "There was an error attempting to connect to the database");
    }
}
