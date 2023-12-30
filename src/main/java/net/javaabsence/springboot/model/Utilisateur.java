package net.javaabsence.springboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode
@Inheritance(strategy = InheritanceType.JOINED)//annotation indicates that you want to use
// a joined table strategy for inheritance. This means each subclass (Administrateur, Enseignant,
// Etudiant) will have its own table, and a join is performed when querying data.
//@DiscriminatorColumn(name = "user_type") //annotation specifies the column that will be used to
// differentiate between the subclasses. This column will contain a discriminator value
// indicating the type of user.

public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String Nom;
    @NonNull
    private String Prenom;
    @NonNull
    @Email
    private String email;

}
