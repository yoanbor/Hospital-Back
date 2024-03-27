package co.simplon.hospitol.presentation.controller.patient;

import co.simplon.hospitol.business.dto.PatientDTO;
import co.simplon.hospitol.business.service.patient.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatePatientController {

    private final IPatientService patientService;


    @Autowired
    public CreatePatientController(IPatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping(path = "./patient")
    public void addPatient(@RequestBody PatientDTO patientDTO) {
        patientService.addPatient(patientDTO);
    }
}
