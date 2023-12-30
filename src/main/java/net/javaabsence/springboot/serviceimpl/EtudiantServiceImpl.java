package net.javaabsence.springboot.serviceimpl;
import net.javaabsence.springboot.model.Absence;
import net.javaabsence.springboot.repository.AbsenceRepository;
import net.javaabsence.springboot.repository.EtudiantRepository;
import net.javaabsence.springboot.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceImpl implements EtudiantService {

    private final EtudiantRepository etudiantRepository;
    private final AbsenceRepository absenceRepository;

    @Autowired
    public EtudiantServiceImpl(EtudiantRepository etudiantRepository,
                               AbsenceRepository absenceRepository) {
                                this.etudiantRepository = etudiantRepository;
                                this.absenceRepository = absenceRepository;
    }

    @Override
    public List<Absence> consulterAbsences(Long etudiantId) {
        // Logic to retrieve absences related to the student
        return absenceRepository.findAbsencesByEtudiantId(etudiantId);
    }

    // Other methods related to student functionality
}

