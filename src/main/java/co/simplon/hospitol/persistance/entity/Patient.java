package co.simplon.hospitol.persistance.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "patients")
public class Patient {


    @Id
    @Column(name = "id_patient")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column(name = "name", length = 50)
    private String name;

    @Basic
    @Column(name = "firstname", length = 50)
    private String firstname;

    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date dob;

    @Basic
    @Column(name = "securitysocialnumber", length = 13)
    private String securitySocialNumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_dt")
    private Timestamp creationDT;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modification_dt")
    private Timestamp modificationDT;

    @ManyToOne
    @JoinColumn(name = "id_service")
    private Service services;

    @ManyToOne
    @JoinColumn(name = "id_bed")
    private Bed beds;

    /**
     * @return the id of the patient
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id of the patient to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return the name of the patient
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name of the patient to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the firstname of the patient
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname of the patient to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     *
     * @return the date of birthday of the patient
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the date of birthday of the patient to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     *
     * @return the security social number of the patient
     */
    public String getSecuritySocialNumber() {
        return securitySocialNumber;
    }

    /**
     * @param securitySocialNumber the security social number of the patient to set
     */
    public void setSecuritySocialNumber(String securitySocialNumber) {
        this.securitySocialNumber = securitySocialNumber;
    }

    /**
     *
     * @return the creation date of patient
     */
    public Timestamp getCreationDT() {
        return creationDT;
    }

    /**
     * @param creationDT the creation date of patient to set
     */
    public void setCreationDT(Timestamp creationDT) {
        this.creationDT = creationDT;
    }

    /**
     *
     * @return the modification date of patient
     */
    public Timestamp getModificationDT() {
        return modificationDT;
    }

    /**
     * @param modificationDT the modification date of patient to set
     */
    public void setModificationDT(Timestamp modificationDT) {
        this.modificationDT = modificationDT;
    }

    public Service getServices() {
        return services;
    }

    public void setServices(Service services) {
        this.services = services;
    }

    public Bed getBeds() {
        return beds;
    }

    public void setBeds(Bed beds) {
        this.beds = beds;
    }
}
