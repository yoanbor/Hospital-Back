package co.simplon.hospitol.persistance.repository.service;

import co.simplon.hospitol.persistance.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceRepository extends JpaRepository<Service, Integer> {
}
