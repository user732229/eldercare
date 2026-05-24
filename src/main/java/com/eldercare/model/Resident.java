package com.eldercare.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity // tabla SQL
@Table(name = "residents")
@Getter //establece get para cada atributo
@Setter //establece set para cada atributo
@NoArgsConstructor //necesario para que Hibernate cree objetos
@AllArgsConstructor //genera constructor
@Builder //genera objetos con sintaxis limpia y facil

public class Resident {

    @Id //genera la PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //valor autoincremental para la PK

    private Long id;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    @Column(unique = true)
    private String dni;

    private LocalDate incomeDate;

    private String dependecyLevel;

    // crear alergies cuando se generen para hacer relacion

    private int contactNumber;

    // crear cronicDisseases cuando se generen para hacer relacion

    // crear acuteDisseases cuando se generen para hacer relacion

    // crear medication cuando se generen para hacer

    // crear room cuando se generen para hacer relacion
}
