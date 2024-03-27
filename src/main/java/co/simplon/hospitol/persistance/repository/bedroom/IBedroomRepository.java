package co.simplon.hospitol.persistance.repository.bedroom;

import co.simplon.hospitol.persistance.entity.Bedroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBedroomRepository extends JpaRepository<Bedroom, Integer> {
}
