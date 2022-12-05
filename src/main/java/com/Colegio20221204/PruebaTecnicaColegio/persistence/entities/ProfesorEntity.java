package com.Colegio20221204.PruebaTecnicaColegio.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode (onlyExplicitlyIncluded = true)
@Table (name = "profesor")
public class ProfesorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @EqualsAndHashCode.Include
    @Column
    private Long Id;

    @Column(name = "title")
    private String nombre;
}
