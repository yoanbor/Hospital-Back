package co.simplon.hospitol.persistance.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "beds")
public class Bed {

    @Id
    @Column(name = "id_bed")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "numbers")
    private int numbers;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_dt")
    private Timestamp creationDT;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modification_dt")
    private Timestamp modificationDT;

    @ManyToOne
    @JoinColumn(name = "id_bedroom")
    private Bedroom bedrooms;

    /**
     * @return the id of the bed
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id of bed to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return the bed's number
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * @param numbers the bed number to set
     */
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    /**
     *
     * @return the creation date of bed
     */
    public Timestamp getCreationDT() {
        return creationDT;
    }

    /**
     * @param creationDT the creation date of bed to set
     */
    public void setCreationDT(Timestamp creationDT) {
        this.creationDT = creationDT;
    }

    /**
     *
     * @return the modification date of bed
     */
    public Timestamp getModificationDT() {
        return modificationDT;
    }

    /**
     * @param modificationDT the modification date of bed to set
     */
    public void setModificationDT(Timestamp modificationDT) {
        this.modificationDT = modificationDT;
    }

    public Bedroom getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Bedroom bedrooms) {
        this.bedrooms = bedrooms;
    }
}
