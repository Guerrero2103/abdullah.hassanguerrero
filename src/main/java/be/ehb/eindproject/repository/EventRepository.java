package be.ehb.eindproject.repository;

import be.ehb.eindproject.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findTop10ByOrderByDateTimeDesc();
}
