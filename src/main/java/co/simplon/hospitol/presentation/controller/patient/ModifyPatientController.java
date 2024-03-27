package co.simplon.hospitol.presentation.controller.patient;

import co.simplon.hospitol.business.dto.PatientDTO;
import co.simplon.hospitol.business.service.patient.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModifyPatientController {

    private final IPatientService patientService;


    @Autowired
    public ModifyPatientController(IPatientService patientService) {
        this.patientService = patientService;
    }

    @PutMapping("/product/{id}")
    public void modifyPatient(@PathVariable int id, @RequestBody PatientDTO patientDTO) {
        patientService.modifyPatient(id, patientDTO);
    }
}
