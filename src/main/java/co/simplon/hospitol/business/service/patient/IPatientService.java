package co.simplon.hospitol.business.service.patient;

import co.simplon.hospitol.business.dto.PatientDTO;

import java.util.List;

public interface IPatientService {

    /**
     * Service permettant de lister les patients
     *
     * @return liste de tous les patients
     */
    List<PatientDTO> getPatients();

    /**
     * @param id
     * @return
     */
    PatientDTO findById(final int id);

    void addPatient(final PatientDTO patient);

    void modifyPatient(int id, PatientDTO patient);



}
