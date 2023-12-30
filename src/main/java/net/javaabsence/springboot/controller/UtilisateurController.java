package net.javaabsence.springboot.controller;

import net.javaabsence.springboot.exception.AuthRequest;
import net.javaabsence.springboot.model.Utilisateur;
import net.javaabsence.springboot.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    @Autowired
    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @PostMapping("/authentifier")
    public ResponseEntity<Utilisateur> authentifier(@RequestBody AuthRequest authRequest) {
        Optional<Utilisateur> utilisateur = utilisateurService.sAuthentifier(authRequest.getUsername(), authRequest.getPassword());
        return utilisateur.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.UNAUTHORIZED));
    }

}

