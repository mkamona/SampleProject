/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

/**
 *
 * @author ahmed
 */
public interface subject {
   
void addObserver(follower o);
void removeObserver(follower o);
void updateAll(String s);    
            
}