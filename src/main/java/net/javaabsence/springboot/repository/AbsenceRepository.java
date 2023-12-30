package net.javaabsence.springboot.repository;

import net.javaabsence.springboot.model.Absence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AbsenceRepository extends JpaRepository<Absence, Long> {
    List<Absence> findAbsencesByEnseignantId(Long id);
    List<Absence> findAbsencesByEtudiantId(Long etudiantId);

}
