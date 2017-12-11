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
public class Payment {
    private PaymentStrategy strategy;

    public Payment(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

 
    

   

   public double executeStrategy(double amount){
      return strategy.makePayment(amount);
   }
}
