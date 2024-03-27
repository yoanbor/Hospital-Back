package co.simplon.hospitol.business.dto;

import java.sql.Timestamp;

public class BedroomDTO {

    private int id_bedroom;

    private int numbers;

    private Timestamp creationDT;

    private Timestamp modificationDT;


    public int getId_bedroom() {
        return id_bedroom;
    }

    public void setId_bedroom(int id_bedroom) {
        this.id_bedroom = id_bedroom;
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
}
