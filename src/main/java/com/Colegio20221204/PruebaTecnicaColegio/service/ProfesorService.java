package com.Colegio20221204.PruebaTecnicaColegio.service;

import com.Colegio20221204.PruebaTecnicaColegio.persistence.dtos.ProfesorDto;
import com.Colegio20221204.PruebaTecnicaColegio.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProfesorService {

    @Autowired
        private ProfesorRepository profesorRepository;

    public List<ProfesorDto> obtenerProfesores (){
        List<Object[]> listObject = profesorRepository.findAllTeachersDto();
        List<ProfesorDto> profesores = new ArrayList<>();
        for (int i =0; i<listObject.size();i++){
            Object[] arreglo = listObject.get(i);
            ProfesorDto profesorDto = new ProfesorDto();
            profesorDto.setId((Long)arreglo[0]);
            profesorDto.setNombre(arreglo[1].toString());
            profesores.add(profesorDto);
        }
        return profesores;
    }
}
