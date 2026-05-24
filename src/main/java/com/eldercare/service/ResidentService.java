package com.eldercare.service;

import com.eldercare.model.Resident;
import com.eldercare.repository.ResidentRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service; //capa que accede a BBD

import java.util.List;

@Service    //Indica que es un componente de lógica de negocio a spring creando un objeto de esta clase
public class ResidentService {

    private final ResidentRepository repository;

    //establece el repositorio que queremos usar como atributo de la clase
    public ResidentService(ResidentRepository repository) {
        this.repository = repository;
    }

    //Genera lista con todos los residentes
    public List<Resident> getAllResidents() {
        return repository.findAll();
    }

    //Creamos metodo público que permita a Hibernate hacer INSERT y UPDATE
    public Resident saveResident(Resident resident){
        return repository.save(resident);
    }
}
