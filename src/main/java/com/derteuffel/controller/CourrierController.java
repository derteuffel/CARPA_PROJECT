package com.derteuffel.controller;

import com.derteuffel.entities.Courrier;
import com.derteuffel.repository.CourrierRepository;
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
@RequestMapping("/courrier")
public class CourrierController {

    @Autowired
    private CourrierRepository courrierRepository;
    @Autowired
    private StatusRepository statusRepository;

    @GetMapping("/courriers")
    public String all(Model model){
        List<Courrier> courriers = courrierRepository.findAll();
        model.addAttribute("courriers", courriers);
        return "courrier/courriers";
    }

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("courrier",new Courrier());
        model.addAttribute("statuses",statusRepository.findAll());
        return "courrier/form";
    }

    public String save(Model model, Errors errors, @RequestParam("files") MultipartFile[] files){
       return null;
    }
}
