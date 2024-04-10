package co.simplon.hospitol.presentation.controller.patient;

import co.simplon.hospitol.business.dto.PatientDTO;
import co.simplon.hospitol.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller class responsible for handling HTTP requests related to reading patients.
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ReadPatientController {

    private final IPatientService patientService;

    /**
     * Constructor for ReadPatientController.
     *
     * @param patientService The service responsible for patient-related operations.
     */
    @Autowired
    public ReadPatientController(IPatientService patientService) {
        this.patientService = patientService;
    }

    /**
     * Endpoint for retrieving all patients.
     *
     * @return A list of DTOs representing all patients.
     */
    @GetMapping("/patient")
    public List<PatientDTO> getPatients() {
        return patientService.getPatients();
    }

}
