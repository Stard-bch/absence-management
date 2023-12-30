package net.javaabsence.springboot.serviceimpl;

import net.javaabsence.springboot.model.Absence;
import net.javaabsence.springboot.model.Seance;
import net.javaabsence.springboot.repository.AbsenceRepository;
import net.javaabsence.springboot.repository.EnseignantRepository;
import net.javaabsence.springboot.repository.SeanceRepository;
import net.javaabsence.springboot.service.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EnseignantServiceImpl implements EnseignantService {

    private final EnseignantRepository enseignantRepository;
    private final SeanceRepository seanceRepository;
    private final AbsenceRepository absenceRepository;

    @Autowired
    public EnseignantServiceImpl(EnseignantRepository enseignantRepository,
                                 SeanceRepository seanceRepository,
                                 AbsenceRepository absenceRepository) {
        this.enseignantRepository = enseignantRepository;
        this.seanceRepository = seanceRepository;
        this.absenceRepository = absenceRepository;
    }

    @Override
    public List<Seance> consulterSeances(Long enseignantId) {
        return seanceRepository.findSeancesByEnseignantId(enseignantId);
    }

    @Override
    public List<Absence> consulterLesAbsences(Long enseignantId) {
        // Logic to retrieve absences related to the teacher
        return absenceRepository.findAbsencesByEnseignantId(enseignantId);
    }

    @Override
    public void saisirAbsence(Absence absence) {
        // Logic to save a new absence
        absenceRepository.save(absence);
    }

    @Override
    public void modifierAbsence(Absence absence) {
        // Logic to update an existing absence
        absenceRepository.save(absence);
    }

    @Override
    public void supprimerAbsence(Long id) {
        // Logic to delete an absence by ID
        absenceRepository.deleteById(id);
    }
}
