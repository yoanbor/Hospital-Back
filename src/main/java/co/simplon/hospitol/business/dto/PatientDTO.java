package co.simplon.hospitol.business.dto;

import co.simplon.hospitol.persistance.entity.Bed;
import co.simplon.hospitol.persistance.entity.Service;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Data Transfer Object (DTO) representing a Patient.
 */
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

    /**
     * Retrieves the ID of the patient.
     *
     * @return The ID of the patient.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the patient.
     *
     * @param id The ID of the patient.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the last name of the patient.
     *
     * @return The last name of the patient.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the last name of the patient.
     *
     * @param name The last name of the patient.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the first name of the patient.
     *
     * @return The first name of the patient.
     */
    public String getFirstname() {
        return firstname;
    }


    /**
     * Sets the first name of the patient.
     *
     * @param firstname The first name of the patient.
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    /**
     * Retrieves the date of birth of the patient.
     *
     * @return The date of birth of the patient.
     */
    public Date getDob() {
        return dob;
    }


    /**
     * Sets the date of birth of the patient.
     *
     * @param dob The date of birth of the patient.
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }


    /**
     * Retrieves the social security number of the patient.
     *
     * @return The social security number of the patient.
     */
    public String getSecuritySocialNumber() {
        return securitySocialNumber;
    }


    /**
     * Sets the social security number of the patient.
     *
     * @param securitySocialNumber The social security number of the patient.
     */
    public void setSecuritySocialNumber(String securitySocialNumber) {
        this.securitySocialNumber = securitySocialNumber;
    }

    /**
     * Retrieves the timestamp indicating the creation date and time of the patient.
     *
     * @return The creation date and time of the patient.
     */
    public Timestamp getCreationDT() {
        return creationDT;
    }


    /**
     * Sets the timestamp indicating the creation date and time of the patient.
     *
     * @param creationDT The creation date and time of the patient.
     */
    public void setCreationDT(Timestamp creationDT) {
        this.creationDT = creationDT;
    }


    /**
     * Retrieves the timestamp indicating the modification date and time of the patient.
     *
     * @return The modification date and time of the patient.
     */
    public Timestamp getModificationDT() {
        return modificationDT;
    }


    /**
     * Sets the timestamp indicating the modification date and time of the patient.
     *
     * @param modificationDT The modification date and time of the patient.
     */
    public void setModificationDT(Timestamp modificationDT) {
        this.modificationDT = modificationDT;
    }


    /**
     * Retrieves the service associated with the patient.
     *
     * @return The service associated with the patient.
     */
    public Service getServices() {
        return (Service) services;
    }

    /**
     * Sets the service associated with the patient.
     *
     * @param services The service associated with the patient.
     */
    public void setServices(Service services) {
        this.services = services;
    }

    /**
     * Retrieves the bed associated with the patient.
     *
     * @return The bed associated with the patient.
     */
    public Bed getBeds() {
        return (Bed) beds;
    }

    /**
     * Sets the bed associated with the patient.
     *
     * @param beds The bed associated with the patient.
     */
    public void setBeds(Bed beds) {
        this.beds = beds;
    }
}
