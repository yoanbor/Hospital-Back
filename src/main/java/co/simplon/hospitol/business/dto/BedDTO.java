package co.simplon.hospitol.business.dto;

import co.simplon.hospitol.persistance.entity.Bedroom;

/**
 * Data Transfer Object (DTO) representing a Bed.
 */
public class BedDTO {
    private int idBed;

    private int numbersBed;

    private Bedroom bedrooms;


    /**
     * Retrieves the ID of the bed.
     *
     * @return The ID of the bed.
     */
    public int getIdBed() {
        return idBed;
    }

    /**
     * Sets the ID of the bed.
     *
     * @param idBed The ID of the bed.
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
     * Retrieves the bedroom associated with the bed.
     *
     * @return The bedroom associated with the bed.
     */
    public Bedroom getBedrooms() {
        return bedrooms;
    }

    /**
     * Sets the bedroom associated with the bed.
     *
     * @param bedrooms The bedroom associated with the bed.
     */
    public void setBedrooms(Bedroom bedrooms) {
        this.bedrooms = bedrooms;
    }
}
