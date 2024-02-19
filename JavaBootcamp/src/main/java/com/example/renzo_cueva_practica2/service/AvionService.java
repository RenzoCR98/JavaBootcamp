package com.example.renzo_cueva_practica2.service;

import com.example.renzo_cueva_practica2.model.Avion;
import com.example.renzo_cueva_practica2.repository.AvionRepository;
import com.example.renzo_cueva_practica2.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AvionService {
    @Autowired
    private AvionRepository avionRepository;

    public ResponseBase agregarAvion(Avion avion){
        Avion avionGuardado=avionRepository.save(avion);
        return new ResponseBase(true,502,
                "Aerolinea creada con exito",
                Optional.of(avionGuardado));
    }
    public ResponseBase buscarAvion(Integer id){
        Optional<Avion> avionBd=avionRepository.findById(id);
        if (avionBd.isPresent()){
            return new ResponseBase(true ,518,"Aerolinea encontrada con éxito", Optional.of(avionBd.get()));
        }
        return new ResponseBase(false,404,"Aerolinea no existe", Optional.empty());
    }
}
