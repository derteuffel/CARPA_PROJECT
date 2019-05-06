package com.derteuffel.controller;

import com.derteuffel.entities.Courier;
import com.derteuffel.repository.CourierRepository;
import com.derteuffel.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by derteuffel on 06/05/2019.
 */
@Controller
@RequestMapping("/courier")
public class CourierController {

    @Autowired
    private CourierRepository courierRepository;
    @Autowired
    private StatusRepository statusRepository;

    @GetMapping("/couriers")
    public String all(Model model){
        List<Courier> couriers=courierRepository.findAll();
        model.addAttribute("couriers", couriers);
        return "courier/couriers";
    }

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("courier",new Courier());
        model.addAttribute("statuses",statusRepository.findAll());
        return "courier/form";
    }

    public String save(Model model, Errors errors, @RequestParam("files") MultipartFile[] files){

    }
}
