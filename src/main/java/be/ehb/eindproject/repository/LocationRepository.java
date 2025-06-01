package be.ehb.eindproject.repository;

import be.ehb.eindproject.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
