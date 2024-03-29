package co.simplon.hospitol.persistance.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;


/**
 * Entity class representing a bedroom.
 */
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
     * Retrieves the ID of the bedroom.
     *
     * @return The ID of the bedroom.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the bedroom.
     *
     * @param id The ID of the bedroom.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the number of beds in the bedroom.
     *
     * @return The number of beds in the bedroom.
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * Sets the number of beds in the bedroom.
     *
     * @param numbers The number of beds in the bedroom.
     */
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    /**
     * Retrieves the timestamp indicating the creation date and time of the bedroom.
     *
     * @return The creation date and time of the bedroom.
     */
    public Timestamp getCreationDT() {
        return creationDT;
    }

    /**
     * Sets the timestamp indicating the creation date and time of the bedroom.
     *
     * @param creationDT The creation date and time of the bedroom.
     */
    public void setCreationDT(Timestamp creationDT) {
        this.creationDT = creationDT;
    }

    /**
     * Retrieves the timestamp indicating the modification date and time of the bedroom.
     *
     * @return The modification date and time of the bedroom.
     */
    public Timestamp getModificationDT() {
        return modificationDT;
    }

    /**
     * Sets the timestamp indicating the modification date and time of the bedroom.
     *
     * @param modificationDT The modification date and time of the bedroom.
     */
    public void setModificationDT(Timestamp modificationDT) {
        this.modificationDT = modificationDT;
    }
}
