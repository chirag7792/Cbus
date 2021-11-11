package com.example.covidapp.controller;

import com.example.covidapp.entities.Guest;
import com.example.covidapp.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final GuestService service;

    @GetMapping("/add")
    public String addForm(@ModelAttribute Guest guest, Model model)
    {
        model.addAttribute("guest", guest);
        return "index";
    }
    @PostMapping("/thanks")
    public String addGuest(@ModelAttribute Guest guest, Model model){
        service.createGuest(guest);
        model.addAttribute("guest", guest);
        return "thankyou";
    }
    @GetMapping("/list")
    public String list( Model model){
        model.addAttribute("Greeting", "GuestList");
        model.addAttribute("Guest", service.getAll());
        return "list";
    }
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
