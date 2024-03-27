package co.simplon.hospitol.presentation.controller.patient;

import co.simplon.hospitol.business.dto.PatientDTO;
import co.simplon.hospitol.business.service.patient.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindPatientController {

    private final IPatientService patientService;

    @Autowired
    public FindPatientController(IPatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patient/{id}")
    public PatientDTO findById(@PathVariable int id) {
        return patientService.findById(id);
    }
}
