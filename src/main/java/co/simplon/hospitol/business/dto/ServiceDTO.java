package co.simplon.hospitol.business.dto;

import java.sql.Timestamp;

/**
 * Data Transfer Object (DTO) representing a service.
 */
public class ServiceDTO {

    private int id;

    private String name;

    private Timestamp creationDT;

    private Timestamp modificationDT;

    /**
     * Retrieves the ID of the service.
     *
     * @return The ID of the service.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the service.
     *
     * @param id The ID of the service.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the service.
     *
     * @return The name of the service.
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name of the service.
     *
     * @param name The name of the service.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the timestamp indicating the creation date and time of the service.
     *
     * @return The creation date and time of the service.
     */
    public Timestamp getCreationDT() {
        return creationDT;
    }

    /**
     * Sets the timestamp indicating the creation date and time of the service.
     *
     * @param creationDT The creation date and time of the service.
     */
    public void setCreationDT(Timestamp creationDT) {
        this.creationDT = creationDT;
    }

    /**
     * Retrieves the timestamp indicating the modification date and time of the service.
     *
     * @return The modification date and time of the service.
     */
    public Timestamp getModificationDT() {
        return modificationDT;
    }

    /**
     * Sets the timestamp indicating the modification date and time of the service.
     *
     * @param modificationDT The modification date and time of the service.
     */
    public void setModificationDT(Timestamp modificationDT) {
        this.modificationDT = modificationDT;
    }
}
