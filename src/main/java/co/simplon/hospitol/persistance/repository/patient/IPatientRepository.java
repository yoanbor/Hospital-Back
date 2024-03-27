package co.simplon.hospitol.persistance.repository.patient;

import co.simplon.hospitol.persistance.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepository extends JpaRepository<Patient, Integer> {
}
