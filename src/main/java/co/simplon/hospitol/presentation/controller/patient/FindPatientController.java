package co.simplon.hospitol.presentation.controller.patient;

import co.simplon.hospitol.business.dto.PatientDTO;
import co.simplon.hospitol.business.service.patient.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class responsible for handling HTTP requests related to finding patients.
 */
@RestController
public class FindPatientController {

    private final IPatientService patientService;

    /**
     * Constructor for FindPatientController.
     *
     * @param patientService The service responsible for patient-related operations.
     */
    @Autowired
    public FindPatientController(IPatientService patientService) {
        this.patientService = patientService;
    }

    /**
     * Endpoint for finding a patient by ID.
     *
     * @param id The ID of the patient to find.
     * @return The DTO representing the found patient.
     */
    @GetMapping("/patient/{id}")
    public PatientDTO findById(@PathVariable int id) {
        return patientService.findById(id);
    }
}
