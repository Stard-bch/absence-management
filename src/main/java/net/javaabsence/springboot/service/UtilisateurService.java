package net.javaabsence.springboot.service;

import net.javaabsence.springboot.model.Utilisateur;

import java.util.Optional;

public interface UtilisateurService {
    Optional<Utilisateur> sAuthentifier(String username, String password);
}
