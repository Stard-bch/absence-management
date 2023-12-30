package net.javaabsence.springboot.service;

import net.javaabsence.springboot.model.Absence;
import net.javaabsence.springboot.model.Seance;

import java.util.List;

public interface EnseignantService {
    List<Seance> consulterSeances(Long enseignantId);
    List<Absence> consulterLesAbsences(Long enseignantId);
    void saisirAbsence(Absence absence);
    void modifierAbsence(Absence absence);
    void supprimerAbsence(Long id);
}
