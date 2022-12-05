package com.Colegio20221204.PruebaTecnicaColegio.controller;

import com.Colegio20221204.PruebaTecnicaColegio.persistence.dtos.ProfesorDto;
import com.Colegio20221204.PruebaTecnicaColegio.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/profesores")
// esto es aceptar todas las conexiones de frontend con backend
@CrossOrigin(origins = "*")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    //@GetMapping("all")
    @RequestMapping(value = "all",method = RequestMethod.GET)
    // lo correcto es el uso de DTO
    public List<ProfesorDto> obtenerProfesores() {
        return profesorService.obtenerProfesores();
    }
}
