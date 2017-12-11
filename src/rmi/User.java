/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.io.Serializable;

/**
 *
 * @author usfng
 */
public class User implements Serializable {

    private String username;
    private String password;
    private String fullName;
    private String address;
    private String email;
    private int age;
    private int phoneNumber;
    private int profileID;
    private int profileStartDate;
    private String nationality;

    public User(String username, String password, String fullName, String address, String email, int age, int phoneNumber, int profileID, int profileStartDate, String nationality) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.profileID = profileID;
        this.profileStartDate = profileStartDate;
        this.nationality = nationality;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    public int getProfileStartDate() {
        return profileStartDate;
    }

    public void setProfileStartDate(int profileStartDate) {
        this.profileStartDate = profileStartDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    

}
            

    