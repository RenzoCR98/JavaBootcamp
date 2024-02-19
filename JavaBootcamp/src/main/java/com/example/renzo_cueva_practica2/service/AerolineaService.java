package com.example.renzo_cueva_practica2.service;

import com.example.renzo_cueva_practica2.model.Aerolinea;
import com.example.renzo_cueva_practica2.repository.AerolineaRepository;
import com.example.renzo_cueva_practica2.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AerolineaService {
    @Autowired
    private AerolineaRepository aerolineaRepository;

    public ResponseBase agregarAerolinea(Aerolinea aerolinea){
        Aerolinea aerolineaGuardado=aerolineaRepository.save(aerolinea);
        return new ResponseBase(true,502,
                "Aerolinea creada con exito",
                Optional.of(aerolineaGuardado));
    }
    public ResponseBase buscarAerolinea(Integer id){
        Optional<Aerolinea> aerolineaBd=aerolineaRepository.findById(id);
        if (aerolineaBd.isPresent()){
            return new ResponseBase(true ,518,"Aerolinea encontrada con éxito", Optional.of(aerolineaBd.get()));
        }
        return new ResponseBase(false,404,"Aerolinea no existe", Optional.empty());
    }
}
