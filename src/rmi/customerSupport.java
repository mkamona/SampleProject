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
public class customerSupport extends User {
    
    public customerSupport(String username, String password, String fullName, String address, String email, int age, int phoneNumber, int profileID, int profileStartDate, String nationality) {
        super(username, password, fullName, address, email, age, phoneNumber, profileID, profileStartDate, nationality);
    }
    
    String availability;
    int earnPerHour;
    String experience;
    int hoursWorked;
    String jobHistory;
    String languages;
    String overView;
    String qualifications;
    String reviews;
    
    
}
