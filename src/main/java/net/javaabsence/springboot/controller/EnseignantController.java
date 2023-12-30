package net.javaabsence.springboot.controller;


import net.javaabsence.springboot.model.Absence;
import net.javaabsence.springboot.model.Enseignant;
import net.javaabsence.springboot.model.Seance;
import net.javaabsence.springboot.repository.EnseignantRepository;
import net.javaabsence.springboot.service.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/enseignant")
public class EnseignantController {
    private final EnseignantService enseignantService;

    @Autowired
    public EnseignantController(EnseignantService enseignantService) {
        this.enseignantService = enseignantService;
    }

    @GetMapping("/seances")
    public ResponseEntity<List<Seance>> consulterSeances(@RequestParam Long enseignantId) {
        List<Seance> seances = enseignantService.consulterSeances(enseignantId);
        return new ResponseEntity<>(seances, HttpStatus.OK);
    }

    @GetMapping("/absences")
    public ResponseEntity<List<Absence>> consulterLesAbsences(@RequestParam Long enseignantId) {
        List<Absence> absences = enseignantService.consulterLesAbsences(enseignantId);
        return new ResponseEntity<>(absences, HttpStatus.OK);
    }

    @PostMapping("/saisirAbsence")
    public ResponseEntity<Void> saisirAbsence(@RequestBody Absence absence) {
        enseignantService.saisirAbsence(absence);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/modifierAbsence")
    public ResponseEntity<Void> modifierAbsence(@RequestBody Absence absence) {
        enseignantService.modifierAbsence(absence);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/supprimerAbsence/{absenceId}")
    public ResponseEntity<Void> supprimerAbsence(@PathVariable Long absenceId) {
        enseignantService.supprimerAbsence(absenceId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
