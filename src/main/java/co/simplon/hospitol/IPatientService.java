package co.simplon.hospitol;

import co.simplon.hospitol.business.dto.PatientDTO;

import java.util.List;

/**
 * Interface for patient-related services.
 */
public interface IPatientService {

    /**
     * Retrieves a list of all patients.
     *
     * @return A list of PatientDTO objects representing all patients.
     */
    List<PatientDTO> getPatients();

    /**
     * Retrieves a patient by their ID.
     *
     * @param id The ID of the patient to retrieve.
     * @return The PatientDTO object representing the patient with the specified ID.
     */
    PatientDTO findById(final int id);

    /**
     * Adds a new patient.
     *
     * @param patient The PatientDTO object representing the patient to be added.
     */
    void addPatient(final PatientDTO patient);

    /**
     * Modifies an existing patient.
     *
     * @param id      The ID of the patient to be modified.
     * @param patient The PatientDTO object representing the modified patient information.
     *
     */
    PatientDTO modifyPatient(int id, PatientDTO patient);

}
