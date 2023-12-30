package net.javaabsence.springboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Etudiant extends Utilisateur{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long etudiantId;
    @NonNull
    private String Genre;
    @NonNull
    private String Formation;
    @NonNull
    private String Niveau;

    // One-to-Many relationship with Absence
    @OneToMany(mappedBy = "etudiant")
    private Set<Absence> absences = new HashSet<>();
}
