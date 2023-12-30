package net.javaabsence.springboot.service;

import net.javaabsence.springboot.model.Absence;

import java.util.List;

public interface EtudiantService {
    List<Absence> consulterAbsences(Long etudiantId);

}
