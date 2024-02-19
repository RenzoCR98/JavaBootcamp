package com.example.renzo_cueva_practica2.repository;

import com.example.renzo_cueva_practica2.model.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasajeroRepository extends JpaRepository<Pasajero, Integer> {
}
