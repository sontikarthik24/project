/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author karthiksonti
 */
public class Organisation {
    
    private int organisationId;
    private String organisationName;
    private String enterpriseName;
    private String networkName;

    public int getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(int organisationId) {
        this.organisationId = organisationId;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
        
    }
    
    public Organisation(int organisationId, String organisationName, String enterpriseName, String networkName){
        this.organisationId = organisationId;
        this.organisationName = organisationName;
        this.enterpriseName = enterpriseName;
        this.networkName = networkName;
    }
    
    
}
