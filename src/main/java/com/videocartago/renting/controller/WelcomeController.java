package com.videocartago.renting.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class WelcomeController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String welcome(Model model) {
        model.addAttribute("miNombre", "Alejandro");

        List<String> peliculas = List.of(
            "Mr. Robot",
            "The Batman",
            "Interstellar",
            "Breaking Bad",
            "Death Note",
            "Kingdom",
            "One Punch Man"
        );
        model.addAttribute("peliculas", peliculas);

        return "welcome";
    }
}
