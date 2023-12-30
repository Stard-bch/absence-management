package net.javaabsence.springboot.controller;

import net.javaabsence.springboot.model.Absence;
import net.javaabsence.springboot.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    private final EtudiantService etudiantService;

    @Autowired
    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @GetMapping("/absences")
    public ResponseEntity<List<Absence>> consulterAbsences(Long etudiantId) {
        List<Absence> absences = etudiantService.consulterAbsences(etudiantId);
        return new ResponseEntity<>(absences, HttpStatus.OK);
    }
}

