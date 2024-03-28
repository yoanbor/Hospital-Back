package co.simplon.hospitol.persistance.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;


@Entity
@Table(name = "bedrooms")
public class Bedroom {

    @Id
    @Column(name = "id_bedroom")
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

    /**
     * @return the id of bedroom
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id of bedroom to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return the bedroom number
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * @param numbers the bedroom number to set
     */
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    /**
     *
     * @return the creation date of bedroom
     */
    public Timestamp getCreationDT() {
        return creationDT;
    }

    /**
     * @param creationDT the creation date of bedroom to set
     */
    public void setCreationDT(Timestamp creationDT) {
        this.creationDT = creationDT;
    }

    /**
     *
     * @return the modification date of bedroom
     */
    public Timestamp getModificationDT() {
        return modificationDT;
    }

    /**
     * @param modificationDT the modification date of bedroom to set
     */
    public void setModificationDT(Timestamp modificationDT) {
        this.modificationDT = modificationDT;
    }
}
