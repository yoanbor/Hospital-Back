package co.simplon.hospitol.business.dto;

import co.simplon.hospitol.persistance.entity.Bedroom;

import java.sql.Timestamp;

/**
 * Data Transfer Object (DTO) representing a Bed.
 */
public class BedDTO {
    private int id;

    private int numbers;

    private Timestamp creationDT;

    private Timestamp modificationDT;

    private Bedroom bedrooms;



    /**
     * Retrieves the ID of the bed.
     *
     * @return The ID of the bed.
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the ID of the bed.
     *
     * @param id The ID of the bed.
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
     * Retrieves the timestamp indicating the creation date and time of the bed.
     *
     * @return The creation date and time of the bed.
     */
    public Timestamp getCreationDT() {
        return creationDT;
    }

    /**
     * Sets the timestamp indicating the creation date and time of the bed.
     *
     * @param creationDT The creation date and time of the bed.
     */
    public void setCreationDT(Timestamp creationDT) {
        this.creationDT = creationDT;
    }

    /**
     * Retrieves the timestamp indicating the modification date and time of the bed.
     *
     * @return The modification date and time of the bed.
     */
    public Timestamp getModificationDT() {
        return modificationDT;
    }

    /**
     * Sets the timestamp indicating the modification date and time of the bed.
     *
     * @param modificationDT The modification date and time of the bed.
     */
    public void setModificationDT(Timestamp modificationDT) {
        this.modificationDT = modificationDT;
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
