package co.simplon.hospitol.persistance.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Entity class representing a patient.
 */
@Entity
@Table(name = "patients")
public class Patient {


    @Id
    @Column(name = "id_patient")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPatient;

    @Basic
    @Column(name = "name", length = 50)
    private String namePatient;

    @Basic
    @Column(name = "firstname", length = 50)
    private String firstnamePatient;

    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date dobPatient;

    @Basic
    @Column(name = "securitysocialnumber", length = 13)
    private String securitySocialNumberPatient;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_dt")
    private Timestamp creationDTPatient;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modification_dt")
    private Timestamp modificationDTPatient;

    @ManyToOne
    @JoinColumn(name = "id_service")
    private Service services;

    @ManyToOne
    @JoinColumn(name = "id_bed")
    private Bed beds;

    /**
     * Retrieves the ID of the patient.
     *
     * @return The ID of the patient.
     */
    public int getIdPatient() {
        return idPatient;
    }

    /**
     * Sets the ID of the patient.
     *
     * @param idPatient The ID of the patient.
     */
    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    /**
     * Retrieves the last name of the patient.
     *
     * @return The last name of the patient.
     */
    public String getNamePatient() {
        return namePatient;
    }

    /**
     * Sets the last name of the patient.
     *
     * @param namePatient The last name of the patient.
     */
    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    /**
     * Retrieves the first name of the patient.
     *
     * @return The first name of the patient.
     */
    public String getFirstnamePatient() {
        return firstnamePatient;
    }

    /**
     * Sets the first name of the patient.
     *
     * @param firstnamePatient The first name of the patient.
     */
    public void setFirstnamePatient(String firstnamePatient) {
        this.firstnamePatient = firstnamePatient;
    }

    /**
     * Retrieves the date of birth of the patient.
     *
     * @return The date of birth of the patient.
     */
    public Date getDobPatient() {
        return dobPatient;
    }

    /**
     * Sets the date of birth of the patient.
     *
     * @param dobPatient The date of birth of the patient.
     */
    public void setDobPatient(Date dobPatient) {
        this.dobPatient = dobPatient;
    }

    /**
     * Retrieves the social security number of the patient.
     *
     * @return The social security number of the patient.
     */
    public String getSecuritySocialNumberPatient() {
        return securitySocialNumberPatient;
    }

    /**
     * Sets the social security number of the patient.
     *
     * @param securitySocialNumberPatient The social security number of the patient.
     */
    public void setSecuritySocialNumberPatient(String securitySocialNumberPatient) {
        this.securitySocialNumberPatient = securitySocialNumberPatient;
    }

    /**
     * Retrieves the timestamp indicating the creation date and time of the patient.
     *
     * @return The creation date and time of the patient.
     */
    public Timestamp getCreationDTPatient() {
        return creationDTPatient;
    }

    /**
     * Sets the timestamp indicating the creation date and time of the patient.
     *
     * @param creationDTPatient The creation date and time of the patient.
     */
    public void setCreationDTPatient(Timestamp creationDTPatient) {
        this.creationDTPatient = creationDTPatient;
    }

    /**
     * Retrieves the timestamp indicating the modification date and time of the patient.
     *
     * @return The modification date and time of the patient.
     */
    public Timestamp getModificationDTPatient() {
        return modificationDTPatient;
    }

    /**
     * Sets the timestamp indicating the modification date and time of the patient.
     *
     * @param modificationDTPatient The modification date and time of the patient.
     */
    public void setModificationDTPatient(Timestamp modificationDTPatient) {
        this.modificationDTPatient = modificationDTPatient;
    }

    /**
     * Retrieves the service associated with the patient.
     *
     * @return The service associated with the patient.
     */
    public Service getServices() {
        return services;
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
        return beds;
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
