package co.simplon.hospitol.persistance.entity;

import jakarta.persistence.*;

/**
 * Entity class representing a bedroom.
 */
@Entity
@Table(name = "bedrooms")
public class Bedroom {

    @Id
    @Column(name = "id_bedroom")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBedroom;

    @Column(name = "numbers")
    private int numbersBedroom;

    /**
     * Retrieves the ID of the bedroom.
     *
     * @return The ID of the bedroom.
     */
    public int getIdBedroom() {
        return idBedroom;
    }

    /**
     * Sets the ID of the bedroom.
     *
     * @param idBedroom The ID of the bedroom.
     */
    public void setIdBedroom(int idBedroom) {
        this.idBedroom = idBedroom;
    }

    /**
     * Retrieves the number of beds in the bedroom.
     *
     * @return The number of beds in the bedroom.
     */
    public int getNumbersBedroom() {
        return numbersBedroom;
    }

    /**
     * Sets the number of beds in the bedroom.
     *
     * @param numbersBedroom The number of beds in the bedroom.
     */
    public void setNumbersBedroom(int numbersBedroom) {
        this.numbersBedroom = numbersBedroom;
    }
}
