package net.javaabsence.springboot.repository;


import net.javaabsence.springboot.model.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {

}
