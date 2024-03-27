package co.simplon.hospitol.presentation.controller.patient;

import co.simplon.hospitol.business.dto.PatientDTO;
import co.simplon.hospitol.business.service.patient.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ReadPatientController {

    private final IPatientService patientService;

    @Autowired
    public ReadPatientController(IPatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/product")
    public List<PatientDTO> getPatients() {
        return patientService.getPatients();
    }

}
