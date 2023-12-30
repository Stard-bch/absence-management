package net.javaabsence.springboot.serviceimpl;
import net.javaabsence.springboot.model.Absence;
import net.javaabsence.springboot.repository.AbsenceRepository;
import net.javaabsence.springboot.repository.AdministrateurRepository;
import net.javaabsence.springboot.service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrateurServiceImpl implements AdministrateurService {

    private final AdministrateurRepository administrateurRepository;
    private final AbsenceRepository absenceRepository;

    @Autowired
    public AdministrateurServiceImpl(AdministrateurRepository administrateurRepository,
                                     AbsenceRepository absenceRepository) {
        this.administrateurRepository = administrateurRepository;
        this.absenceRepository = absenceRepository;
    }

    @Override
    public List<Absence> consulterAbsences() {
        // Logic to retrieve absences (you might have specific criteria or filters)
        return absenceRepository.findAll();
    }

}

