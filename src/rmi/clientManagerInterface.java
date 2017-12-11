/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author usfng
 */
public interface clientManagerInterface extends Remote {
    
    public User login(String username, String password) throws RemoteException;
    
    public int register(String username, String password, String fullName) throws RemoteException;  
}
