package co.simplon.hospitol.business.dto;

/**
 * Data Transfer Object (DTO) representing a Bedroom.
 */
public class BedroomDTO {

    private int idBedroom;

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
     * Retrieves the number of the bedroom.
     *
     * @return The number of the bedroom.
     */
    public int getNumbersBedroom() {
        return numbersBedroom;
    }

    /**
     * Sets the number of the bedroom.
     *
     * @param numbersBedroom The number of the bedroom.
     */
    public void setNumbersBedroom(int numbersBedroom) {
        this.numbersBedroom = numbersBedroom;
    }

}
