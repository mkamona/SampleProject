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
public class Cash implements PaymentStrategy {

 double tax=20;
    public double makePayment(double amount) {
         
             System.out.println("paying by cash " +amount);
               amount+=tax;
               
               return amount;
  
    }
    
    
}
