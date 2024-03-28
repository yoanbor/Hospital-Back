package co.simplon.hospitol.business.dto;

import co.simplon.hospitol.persistance.entity.Bedroom;

import java.sql.Timestamp;

public class BedDTO {
    private int id_bed;

    private int numbers;

    private Timestamp creationDT;

    private Timestamp modificationDT;

    private Bedroom bedrooms;


    public int getId_bed() {
        return id_bed;
    }

    public void setId_bed(int id_bed) {
        this.id_bed = id_bed;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public Timestamp getCreationDT() {
        return creationDT;
    }

    public void setCreationDT(Timestamp creationDT) {
        this.creationDT = creationDT;
    }

    public Timestamp getModificationDT() {
        return modificationDT;
    }

    public void setModificationDT(Timestamp modificationDT) {
        this.modificationDT = modificationDT;
    }

    public Bedroom getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Bedroom bedrooms) {
        this.bedrooms = bedrooms;
    }
}
