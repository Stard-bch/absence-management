package net.javaabsence.springboot.serviceimpl;

import net.javaabsence.springboot.model.Utilisateur;
import net.javaabsence.springboot.repository.UtilisateurRepository;
import net.javaabsence.springboot.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public UtilisateurServiceImpl(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public Optional<Utilisateur> sAuthentifier(String username, String password) {
        // Logic to authenticate the user based on the provided username and password
        return utilisateurRepository.findByUsernameAndPassword(username, password);
    }

    // Other methods related to user functionality
}

