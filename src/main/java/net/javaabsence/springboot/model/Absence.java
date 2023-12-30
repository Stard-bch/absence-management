package net.javaabsence.springboot.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode

public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long absenceId;
    @NonNull
    private String Affirmation;

    //implement the relationship between Absence and Enseignant (*-1)
    @ManyToOne
    @JoinColumn(name = "enseignant_id")
    private Enseignant absenceEnseignant;

    // One-to-Many relationship with Seance
    @OneToMany(mappedBy = "absence", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Seance> seances = new HashSet<>();

    // Many-to-One relationship with Etudiant
    @ManyToOne
    @JoinColumn(name = "etudiant_id")
    private Etudiant etudiant;

}
