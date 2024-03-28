package co.simplon.hospitol.persistance.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;


@Entity
@Table(name = "Services")
public class Service {

    @Id
    @Column(name = "id_service", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column(name = "name", length = 50)
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_dt")
    private Timestamp creationDT;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modification_dt")
    private Timestamp modificationDT;


    /**
     * @return the id of service
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id of service to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name of service
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name of service to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the creation date of service
     */
    public Timestamp getCreationDT() {
        return creationDT;
    }

    /**
     * @param creationDT the creation date of service to set
     */
    public void setCreationDT(Timestamp creationDT) {
        this.creationDT = creationDT;
    }

    /**
     *
     * @return the modification date of service
     */
    public Timestamp getModificationDT() {
        return modificationDT;
    }

    /**
     * @param modificationDT the modification date of service to set
     */
    public void setModificationDT(Timestamp modificationDT) {
        this.modificationDT = modificationDT;
    }
}
