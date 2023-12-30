package net.javaabsence.springboot.controller;


import net.javaabsence.springboot.model.Absence;
import net.javaabsence.springboot.service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/administrateur")

public class AdministrateurController {

    private final AdministrateurService administrateurService;

    @Autowired
    public AdministrateurController(AdministrateurService administrateurService) {
        this.administrateurService = administrateurService;
    }

    @GetMapping("/absences")
    public ResponseEntity<List<Absence>> consulterAbsences() {
        List<Absence> absences = administrateurService.consulterAbsences();
        return new ResponseEntity<>(absences, HttpStatus.OK);
    }

}

