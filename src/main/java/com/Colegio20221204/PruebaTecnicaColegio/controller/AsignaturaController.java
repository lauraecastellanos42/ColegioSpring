package com.Colegio20221204.PruebaTecnicaColegio.controller;


import com.Colegio20221204.PruebaTecnicaColegio.persistence.dtos.AsignaturaInfoDto;
import com.Colegio20221204.PruebaTecnicaColegio.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asignaturas")
// esto es aceptar todas las conexiones de frontend con backend
@CrossOrigin(origins = "*")
public class AsignaturaController {
    @Autowired
    private AsignaturaService asignaturaService;

    @RequestMapping(value = "profesor/{id}",method = RequestMethod.GET)
    public List<AsignaturaInfoDto> obtenerAsignaturaPorProfesor(@PathVariable("id") Long id){
        return asignaturaService.asignaturasPorProfesor(id);
    }
}
