/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author ahmed
 */
public class Trip implements subject{
    
    String arrivalDate;
    String classType;
    String departureDate;
    String destenation;
    int seatNumber;
    int trainNumber;
    int tripCost;
    int tripNumber;

        ArrayList<follower> observers= new ArrayList();
    
    @Override
    public void addObserver(follower o) {
           observers.add(o);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeObserver(follower o) {
        observers.remove(o);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAll(String s) {
        for(int i= 0; i< observers.size(); i++)
        {
            observers.get(i).update(s);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
  
}
