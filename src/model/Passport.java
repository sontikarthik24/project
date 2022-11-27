/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author karthiksonti
 */
public class Passport {
    
    private String name;
    private String dob;
    private String gender;
    private String address;
    private int phone;
    private String email;
    private String applicationId;
    private String status;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getStaus() {
        return status;
    }

    public void setStaus(String staus) {
        this.status = staus;
    }

    public String getPassportApplication() {
        return applicationId;
    }

    public void setPassportApplication(String passportApplication) {
        this.applicationId = passportApplication;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    public Passport(String name, String dob, String gender, String address, int phone, String email, String applicationId, String status){
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.applicationId = applicationId;
        this.status = status;
    }
    
}
