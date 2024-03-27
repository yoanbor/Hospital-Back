package co.simplon.hospitol.persistance.repository.bed;

import co.simplon.hospitol.persistance.entity.Bed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBedRepository extends JpaRepository<Bed, Integer> {
}
