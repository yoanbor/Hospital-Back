package co.simplon.hospitol.presentation.controller.patient;

import co.simplon.hospitol.business.dto.PatientDTO;
import co.simplon.hospitol.business.service.patient.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class responsible for handling HTTP requests related to creating patients.
 */

@RestController
public class CreatePatientController {

    private final IPatientService patientService;


    /**
     * Constructor for CreatePatientController.
     *
     * @param patientService The service responsible for patient-related operations.
     */
    @Autowired
    public CreatePatientController(IPatientService patientService) {
        this.patientService = patientService;
    }

    /**
     * Endpoint for adding a new patient.
     *
     * @param patientDTO The DTO representing the patient to be added.
     */
    @PostMapping(path = "/patient")
    public void addPatient(@RequestBody PatientDTO patientDTO) {
        patientService.addPatient(patientDTO);
    }
}
