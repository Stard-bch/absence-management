package net.javaabsence.springboot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime time;

    //implement the relationship between Seance and Enseignant (*-1)
    @ManyToOne
    @JoinColumn(name = "enseignant_id")
    private Enseignant seanceEnseignant;

    // Many-to-One relationship with Module
    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;

    // Many-to-One relationship with Absence
    @ManyToOne
    @JoinColumn(name = "absence_id")
    private Absence absence;

}
