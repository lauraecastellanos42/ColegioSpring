package com.Colegio20221204.PruebaTecnicaColegio.persistence.dtos;

import lombok.*;

import java.net.URI;
import java.net.URISyntaxException;

@Setter
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class AsignaturaInfoDto {
    @EqualsAndHashCode.Include
    private Long id;

    private String nombre;

    public AsignaturaInfoDto(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;

    }
}
