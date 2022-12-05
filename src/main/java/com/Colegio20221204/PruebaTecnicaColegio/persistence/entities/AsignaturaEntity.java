package com.Colegio20221204.PruebaTecnicaColegio.persistence.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "asignatura")

public class AsignaturaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @EqualsAndHashCode.Include
    @Column
    private Long Id;

    @Column
    private String nombre;

    @Column (name="id_curso")
    private Long id_curso;

    @Column (name="id_profesor")
    private Long id_profesor;

}
