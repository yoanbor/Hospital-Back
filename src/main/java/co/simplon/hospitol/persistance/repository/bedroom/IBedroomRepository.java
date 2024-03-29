package co.simplon.hospitol.persistance.repository.bedroom;

import co.simplon.hospitol.persistance.entity.Bedroom;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for accessing and managing Bedroom entities in the database.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface IBedroomRepository extends JpaRepository<Bedroom, Integer> {
}
