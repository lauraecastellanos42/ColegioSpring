package com.Colegio20221204.PruebaTecnicaColegio.service;

import com.Colegio20221204.PruebaTecnicaColegio.persistence.dtos.AsignaturaInfoDto;
import com.Colegio20221204.PruebaTecnicaColegio.persistence.dtos.ProfesorDto;
import com.Colegio20221204.PruebaTecnicaColegio.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AsignaturaService {
    @Autowired
    private AsignaturaRepository asignaturaRepository;

    public List<AsignaturaInfoDto> asignaturasPorProfesor (Long idProfesor){
        return asignaturaRepository.GetAsignatureByTeacher(idProfesor);
    }
}
