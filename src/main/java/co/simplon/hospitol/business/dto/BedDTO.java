package co.simplon.hospitol.business.dto;

import co.simplon.hospitol.persistance.entity.Bedroom;

import java.sql.Timestamp;
import java.util.List;

public class BedDTO {
    private int id_bed;

    private int numbers;

    private Timestamp creationDT;

    private Timestamp modificationDT;

    private List<Bedroom> bedrooms;


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

    public List<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(List<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }
}
