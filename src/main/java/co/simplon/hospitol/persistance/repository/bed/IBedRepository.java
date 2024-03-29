package co.simplon.hospitol.persistance.repository.bed;

import co.simplon.hospitol.persistance.entity.Bed;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for accessing and managing Bed entities in the database.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface IBedRepository extends JpaRepository<Bed, Integer> {
}
