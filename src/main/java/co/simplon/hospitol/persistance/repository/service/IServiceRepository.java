package co.simplon.hospitol.persistance.repository.service;

import co.simplon.hospitol.persistance.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for accessing and managing Service entities in the database.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface IServiceRepository extends JpaRepository<Service, Integer> {
}
