package com.eldercare.repository;

import com.eldercare.model.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

//Genera funciones de consulta, guardado y eliminación sin escribir SQL
public interface ResidentRepository
    extends JpaRepository<Resident, Long> {
}

