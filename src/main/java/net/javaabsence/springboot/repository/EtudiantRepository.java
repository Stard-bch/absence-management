package net.javaabsence.springboot.repository;


import net.javaabsence.springboot.model.Absence;
import net.javaabsence.springboot.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Absence> findAbsencesByEtudiantId(Long etudiantId);
}
