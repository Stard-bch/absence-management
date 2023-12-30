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
public class Enseignant extends Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enseignantId;

    //implement the relationship between Séance and Enseignant (1-*)
    @OneToMany(mappedBy = "seanceEnseignant", cascade = CascadeType.ALL)
    private Set<Seance> seances=new HashSet<>();

    //implement the relationship between Absence and Enseignant (1-*)
    @OneToMany(mappedBy = "absenceEnseignant")
    private Set<Absence> absences=new HashSet<>();


}
