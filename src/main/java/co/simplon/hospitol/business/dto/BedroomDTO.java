package co.simplon.hospitol.business.dto;

import java.sql.Timestamp;

/**
 * Data Transfer Object (DTO) representing a Bedroom.
 */
public class BedroomDTO {

    private int id;

    private int numbers;

    private Timestamp creationDT;

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
     * Retrieves the number of the bedroom.
     *
     * @return The number of the bedroom.
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * Sets the number of the bedroom.
     *
     * @param numbers The number of the bedroom.
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
