package co.simplon.hospitol.presentation.controller.patient;

import co.simplon.hospitol.business.dto.PatientDTO;
import co.simplon.hospitol.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class responsible for handling HTTP requests related to modifying patients.
 */
@RestController
public class ModifyPatientController {

    private final IPatientService patientService;


    /**
     * Constructor for ModifyPatientController.
     *
     * @param patientService The service responsible for patient-related operations.
     */
    @Autowired
    public ModifyPatientController(IPatientService patientService) {
        this.patientService = patientService;
    }

    /**
     * Endpoint for modifying a patient.
     *
     * @param id          The ID of the patient to modify.
     * @param patientDTO  The DTO representing the modifications to apply to the patient.
     */
    @PutMapping("/patient/{id}")
    public void modifyPatient(@PathVariable int id, @RequestBody PatientDTO patientDTO) {
        patientService.modifyPatient(id, patientDTO);
    }
}
