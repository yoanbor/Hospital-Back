package co.simplon.hospitol.business.service.patient;

import co.simplon.hospitol.business.dto.PatientDTO;

import java.util.List;

public interface IPatientService {

    List<PatientDTO> getPatients();

    PatientDTO findById(final int id);

    void addPatient(final PatientDTO patient);

    void modifyPatient(int id, PatientDTO patient);



}
