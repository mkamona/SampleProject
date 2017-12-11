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
public class systemAdmin  {
    
  
  
     private static systemAdmin instance = null;
   private systemAdmin() {
      // Exists only to defeat instantiation.
   }
   public static systemAdmin getInstance() {
      if(instance == null) {
         instance = new systemAdmin();
      }
      return instance;
   }

    
    
}
