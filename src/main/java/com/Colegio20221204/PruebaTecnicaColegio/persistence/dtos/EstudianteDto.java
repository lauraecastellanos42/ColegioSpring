package com.Colegio20221204.PruebaTecnicaColegio.persistence.dtos;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EstudianteDto {
    @EqualsAndHashCode.Include
    Long Id;
    String nombre;
}
