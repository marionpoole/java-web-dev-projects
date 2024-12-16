package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    //private static List<String> events = new ArrayList<>();
    HashMap<String, String> events = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        events.put("CodeDay", "Beginners meet to build games and web applications");
        events.put("LaunchCode Meetup", "Meetup to network and catch up on all things coding");
        events.put("Code with Pride", "A fun meetup sponsored by LaunchCode");
        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
        return "events/index";
    }

    //lives at /events/create
@GetMapping("create")
    public String renderCreateEventsForm(Model model) {
        model.addAttribute("title", "Create Event");
    return "events/create";
}

//lives at /events/create
@PostMapping("create")
public String createEvent(@RequestParam String eventName, String eventDescription) {
events.put(eventName, eventDescription);
return "redirect:/events";
}
}
