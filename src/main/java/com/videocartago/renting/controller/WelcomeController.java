package com.videocartago.renting.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {
   @RequestMapping(value="/", method=RequestMethod.GET)
   public String welcome(Model model){
        model.addAttribute("miNombre", "Alejandro");
       return "welcome"; // corresponde al nombre de la plantilla
   }
}