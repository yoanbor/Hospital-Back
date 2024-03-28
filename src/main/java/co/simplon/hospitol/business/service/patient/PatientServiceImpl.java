package co.simplon.hospitol.business.service.patient;

import co.simplon.hospitol.business.convert.PatientConvert;
import co.simplon.hospitol.business.dto.PatientDTO;
import co.simplon.hospitol.persistance.entity.Patient;
import co.simplon.hospitol.persistance.repository.patient.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements IPatientService {

    @Autowired
    public void setPatientRepo(IPatientRepository patientRepo) {
        this.patientRepo = patientRepo;
    }

    private IPatientRepository patientRepo;

    @Override
    public List<PatientDTO> getPatients() {
        final List<Patient> result = patientRepo.findAll();
        return PatientConvert.getInstance().convertListEntityToListDto(result);
    }

    @Override
    public PatientDTO findById(int id) {
        final Patient result = patientRepo.getReferenceById(id);
        return PatientConvert.getInstance().convertEntityToDto(result);
    }

    @Override
    public void addPatient(PatientDTO patient) {
        patientRepo.save(PatientConvert.getInstance().convertDtoToEntity(patient));
    }

    @Override
    public void modifyPatient(int id, PatientDTO patientDTO) {
        Optional<Patient> optionalPatient = patientRepo.findById(id);
        if (optionalPatient.isPresent()) {
            Patient existingPatient = optionalPatient.get();
            existingPatient.setName(patientDTO.getName());
            existingPatient.setFirstname(patientDTO.getFirstname());
            existingPatient.setDob(patientDTO.getDob());
            existingPatient.setSecuritySocialNumber(patientDTO.getSecuritySocialNumber());
            existingPatient.setServices(patientDTO.getServices());
            existingPatient.setBeds(patientDTO.getBeds());

         patientRepo.save(existingPatient);



    }


}}
