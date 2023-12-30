package net.javaabsence.springboot.service;

import net.javaabsence.springboot.model.Absence;

import java.util.List;

public interface AdministrateurService {
    List<Absence> consulterAbsences();
}
