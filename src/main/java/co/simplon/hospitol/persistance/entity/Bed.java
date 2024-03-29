package co.simplon.hospitol.persistance.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

/**
 * Represents a bed entity that is mapped to the "beds" table in the database.
 */
@Entity
@Table(name = "beds")
public class Bed {

    /**
     * The unique identifier of the bed.
     */
    @Id
    @Column(name = "id_bed")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * The number of beds.
     */
    @Column(name = "numbers")
    private int numbers;

    /**
     * The timestamp indicating the creation date and time of the bed entity.
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_dt")
    private Timestamp creationDT;

    /**
     * The timestamp indicating the modification date and time of the bed entity.
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modification_dt")
    private Timestamp modificationDT;

    /**
     * The bedroom associated with this bed.
     */
    @ManyToOne
    @JoinColumn(name = "id_bedroom")
    private Bedroom bedrooms;

    /**
     * Retrieves the unique identifier of the bed.
     *
     * @return The unique identifier of the bed.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the bed.
     *
     * @param id The unique identifier of the bed.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the number of beds.
     *
     * @return The number of beds.
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * Sets the number of beds.
     *
     * @param numbers The number of beds.
     */
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    /**
     * Retrieves the timestamp indicating the creation date and time of the bed entity.
     *
     * @return The creation date and time of the bed entity.
     */
    public Timestamp getCreationDT() {
        return creationDT;
    }

    /**
     * Sets the timestamp indicating the creation date and time of the bed entity.
     *
     * @param creationDT The creation date and time of the bed entity.
     */
    public void setCreationDT(Timestamp creationDT) {
        this.creationDT = creationDT;
    }

    /**
     * Retrieves the timestamp indicating the modification date and time of the bed entity.
     *
     * @return The modification date and time of the bed entity.
     */
    public Timestamp getModificationDT() {
        return modificationDT;
    }

    /**
     * Sets the timestamp indicating the modification date and time of the bed entity.
     *
     * @param modificationDT The modification date and time of the bed entity.
     */
    public void setModificationDT(Timestamp modificationDT) {
        this.modificationDT = modificationDT;
    }

    /**
     * Retrieves the bedroom associated with this bed.
     *
     * @return The bedroom associated with this bed.
     */
    public Bedroom getBedrooms() {
        return bedrooms;
    }

    /**
     * Sets the bedroom associated with this bed.
     *
     * @param bedrooms The bedroom associated with this bed.
     */
    public void setBedrooms(Bedroom bedrooms) {
        this.bedrooms = bedrooms;
    }
}
