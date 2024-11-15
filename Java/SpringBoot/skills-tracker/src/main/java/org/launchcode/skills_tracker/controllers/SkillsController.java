package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
@GetMapping
    @ResponseBody
    public String intro() {
    return "<h1>Skills Tracker</h1>" +
            "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
            "<ol><li>JavaScript</li>" +
            "<li>Java</li>" +
            "<li>C#</li></ol>";
}

@GetMapping("form")
@ResponseBody
    public String coderForm() {
String html = "<form method = 'post'>" +
        "<label>Name: " +
        "<br>" +
        "<input type = 'text' name = 'name'>" +
        "</label><br>" +
        "<label>My favorite language: " +
        "<br>" +
        "<select name = 'lang1'>" +
        "<option value = 'JavaScript'>JavaScript</option>" +
        "<option value = 'Java'>Java</option>" +
        "<option value = 'C#'>C#</option>" +
        "</select>" +
        "</label>" +
        "<br>" +
        "<label>My second favorite language: " +
        "<br>" +
        "<select name = 'lang2'>" +
        "<option value = 'JavaScript'>JavaScript</option>" +
        "<option value = 'Java'>Java</option>" +
        "<option value = 'C#'>C#</option>" +
        "</select>" +
        "</label>" +
        "<br>" +
        "<label>My third favorite language: " +
        "<br>" +
        "<select name = 'lang3'>" +
        "<option value = 'JavaScript'>JavaScript</option>" +
        "<option value = 'Java'>Java</option>" +
        "<option value = 'C#'>C#</option>" +
        "</select>" +
        "</label>" +
        "<br>" +
        "<input type = 'submit' value = 'Submit'>" +
        "</form>";
return html;
}

@PostMapping("form")
    @ResponseBody
    public String handleForm(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3) {
    return "<h1>" + name +
            "</h1>" +
            "<ol><li>" + lang1 + "</li>" +
            "<li>" + lang2 +
            "</li>" +
            "<li>" + lang3 +
            "</li>" +
            "</ol>";
}

}
