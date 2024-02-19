package com.example.renzo_cueva_practica2.controller;

import com.example.renzo_cueva_practica2.model.Aerolinea;
import com.example.renzo_cueva_practica2.response.ResponseBase;
import com.example.renzo_cueva_practica2.service.AerolineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AerolineaController {
    @Autowired
    private AerolineaService aerolineaService;

    @PostMapping("/api/v1/aerolinea/save")
    public ResponseBase create(@RequestBody Aerolinea aerolinea){
        ResponseBase responseService=aerolineaService.agregarAerolinea(aerolinea);
        return responseService;
    }


    @GetMapping("/api/v1/aerolinea/get/{id}")
    public ResponseBase obtener(@PathVariable Integer id){
        ResponseBase responseService=aerolineaService.buscarAerolinea(id);
        return responseService;
    }
}
