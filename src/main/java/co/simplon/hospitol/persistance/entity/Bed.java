package co.simplon.hospitol.persistance.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "beds")
public class Bed {

    @Id
    @Column(name = "id_bed", nullable = false)
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

    @OneToMany
    @JoinColumn(name = "id_bedroom")
    private List<Bedroom> bedrooms;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return the number's bed
     */
    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
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

    public List<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(List<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }
}
