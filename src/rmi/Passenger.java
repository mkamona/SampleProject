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
public class Passenger extends User {
    
    public Passenger(String username, String password, String fullName, String address, String email, int age, int phoneNumber, int profileID, int profileStartDate, String nationality) {
        super(username, password, fullName, address, email, age, phoneNumber, profileID, profileStartDate, nationality);
    }
    
    private int creditCardNumber;
    private String organizationName;
    
     
    private readOnlyTrip i;
     
     Payment cashPayment = new Payment(new Cash());	
     Payment creditCardPayment = new Payment(new mobilePayment());		
      Payment BankTransferPayment = new Payment(new BankTransfer());	
    
//    public Passenger(readOnlyTrip i)
//    {
//        this.i = i;
//    }
    
    public void getTripInfo(int index)
    {
        i.getITripInfo(index);
    }
    
}
