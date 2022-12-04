/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author karthiksonti
 */
public class Pharma {
    
    private int pharmaId;
    private String pharmaName;
    private String hospitalName;

    public int getPharmaId() {
        return pharmaId;
    }

    public void setPharmaId(int pharmaId) {
        this.pharmaId = pharmaId;
    }

    public String getPharmaName() {
        return pharmaName;
    }

    public void setPharmaName(String pharmaName) {
        this.pharmaName = pharmaName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    public Pharma(int pharmaId, String pharmaName, String hospitalName) {
        this.pharmaId = pharmaId;
        this.pharmaName = pharmaName;
        this.hospitalName = hospitalName;
    }
}
