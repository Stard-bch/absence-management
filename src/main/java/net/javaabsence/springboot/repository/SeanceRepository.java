package net.javaabsence.springboot.repository;

import net.javaabsence.springboot.model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeanceRepository extends JpaRepository<Seance, Long> {
        List<Seance> findSeancesByEnseignantId(Long Id);
}
