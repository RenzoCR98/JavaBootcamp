package com.example.renzo_cueva_practica2.service;

import com.example.renzo_cueva_practica2.model.Vuelo;
import com.example.renzo_cueva_practica2.repository.VueloRepository;
import com.example.renzo_cueva_practica2.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class VueloService {
    @Autowired
    private VueloRepository vueloRepository;

    public ResponseBase agregarVuelo(Vuelo vuelo){
        Vuelo vueloGuardado=vueloRepository.save(vuelo);
        return new ResponseBase(true,200,
                "Vuelo creado con exito",
                Optional.of(vueloGuardado));
    }
    public ResponseBase buscarVuelo(Integer id){
        Optional<Vuelo> vueloBd=vueloRepository.findById(id);
        if (vueloBd.isPresent()){
            return new ResponseBase(true ,408,"Vuelo encontrado con éxito", Optional.of(vueloBd.get()));
        }
        return new ResponseBase(false,404,"Vuelo no existe", Optional.empty());
    }
}
