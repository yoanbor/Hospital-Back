package co.simplon.hospitol.persistance.repository.patient;

import co.simplon.hospitol.persistance.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for accessing and managing Patient entities in the database.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface IPatientRepository extends JpaRepository<Patient, Integer> {
}
