package com.Colegio20221204.PruebaTecnicaColegio.persistence.dtos;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class ProfesorDto {
    Long Id;
    String nombre;
}
