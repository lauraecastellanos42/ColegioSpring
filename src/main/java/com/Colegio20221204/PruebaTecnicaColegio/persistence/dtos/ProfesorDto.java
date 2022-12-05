package com.Colegio20221204.PruebaTecnicaColegio.persistence.dtos;

import jakarta.persistence.Column;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProfesorDto {
    @EqualsAndHashCode.Include
    Long Id;
    String nombre;
}
