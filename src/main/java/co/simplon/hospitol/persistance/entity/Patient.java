package co.simplon.hospitol.persistance.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "patients")
public class Patient {


    @Id
    @Column(name = "id_patient", nullable = false)
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

    @OneToMany
    @JoinColumn(name = "id_service")
    private List<Service> services;

    @OneToMany
    @JoinColumn(name = "id_bed")
    private List<Bed> beds;

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

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Bed> getBeds() {
        return beds;
    }

    public void setBeds(List<Bed> beds) {
        this.beds = beds;
    }
}
