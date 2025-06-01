package be.ehb.eindproject.controller;

import be.ehb.eindproject.model.Event;
import be.ehb.eindproject.repository.EventRepository;
import be.ehb.eindproject.repository.LocationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/events")
public class EventController {

    private final EventRepository eventRepo;
    private final LocationRepository locationRepo;

    public EventController(EventRepository eventRepo, LocationRepository locationRepo) {
        this.eventRepo = eventRepo;
        this.locationRepo = locationRepo;
    }

    @GetMapping
    public String showAllEvents(Model model) {
        model.addAttribute("events", eventRepo.findTop10ByOrderByDateTimeDesc());
        return "events/list";
    }

    @PostMapping("/{id}/delete")
    public String deleteEvent(@PathVariable Long id) {
        eventRepo.deleteById(id);
        return "redirect:/events";
    }


    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("event", new Event());
        model.addAttribute("locations", locationRepo.findAll());
        return "events/new";
    }

    @PostMapping
    public String saveEvent(@ModelAttribute Event event) {
        eventRepo.save(event);
        return "redirect:/events";
    }

    @GetMapping("/{id}")
    public String showEventDetails(@PathVariable Long id, Model model) {
        Event event = eventRepo.findById(id).orElseThrow();
        model.addAttribute("event", event);
        return "events/detail";
    }
}
