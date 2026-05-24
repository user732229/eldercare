package com.eldercare.controller;

import com.eldercare.model.Resident;
import com.eldercare.service.ResidentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //expone endpoints REST
@RequestMapping("/api/residents") //ruta del controller
public class ResidentController {

    private final ResidentService service;

    //al establecer el servicio como atributo también el repositorio
    public ResidentController(ResidentService service){
        this.service = service;
    }

    //delega la lógica al service para que devuelva todos los residentes
    @GetMapping //obliga a usar la API para el get
    public List<Resident> getAllResidents(){
        return service.getAllResidents();
    }

    @PostMapping    //obliga a usar la API para el post
    public Resident createResident(@RequestBody Resident resident){ //convierte el JSON recibido en un objeto resident
        return service.saveResident(resident);
    }
}
