package co.simplon.hospitol.business.dto;

import co.simplon.hospitol.persistance.entity.Bed;
import co.simplon.hospitol.persistance.entity.Service;

import java.sql.Timestamp;
import java.util.Date;

public class PatientDTO {

    private int id;

    private String name;

    private String firstname;

    private Date dob;

    private String securitySocialNumber;

    private Timestamp creationDT;

    private Timestamp modificationDT;

    private Service services;

    private Bed beds;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSecuritySocialNumber() {
        return securitySocialNumber;
    }

    public void setSecuritySocialNumber(String securitySocialNumber) {
        this.securitySocialNumber = securitySocialNumber;
    }

    public Timestamp getCreationDT() {
        return creationDT;
    }

    public void setCreationDT(Timestamp creationDT) {
        this.creationDT = creationDT;
    }

    public Timestamp getModificationDT() {
        return modificationDT;
    }

    public void setModificationDT(Timestamp modificationDT) {
        this.modificationDT = modificationDT;
    }

    public Service getServices() {
        return (Service) services;
    }

    public void setServices(Service services) {
        this.services = services;
    }

    public Bed getBeds() {
        return (Bed) beds;
    }

    public void setBeds(Bed beds) {
        this.beds = beds;
    }
}
