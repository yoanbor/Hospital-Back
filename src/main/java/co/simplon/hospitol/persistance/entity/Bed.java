package co.simplon.hospitol.persistance.entity;

import jakarta.persistence.*;

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
    private int idBed;

    /**
     * The number of beds.
     */
    @Column(name = "numbers")
    private int numbersBed;

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
    public int getIdBed() {
        return idBed;
    }

    /**
     * Sets the unique identifier of the bed.
     *
     * @param idBed The unique identifier of the bed.
     */
    public void setIdBed(int idBed) {
        this.idBed = idBed;
    }

    /**
     * Retrieves the number of beds.
     *
     * @return The number of beds.
     */
    public int getNumbersBed() {
        return numbersBed;
    }

    /**
     * Sets the number of beds.
     *
     * @param numbersBed The number of beds.
     */
    public void setNumbersBed(int numbersBed) {
        this.numbersBed = numbersBed;
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
