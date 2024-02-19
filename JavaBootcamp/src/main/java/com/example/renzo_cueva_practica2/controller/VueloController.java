package com.example.renzo_cueva_practica2.controller;

import com.example.renzo_cueva_practica2.model.Vuelo;
import com.example.renzo_cueva_practica2.response.ResponseBase;
import com.example.renzo_cueva_practica2.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VueloController {
    @Autowired
    private VueloService vueloService;

    @PostMapping("/api/v1/vuelo/save")
    public ResponseBase create(@RequestBody Vuelo vuelo){
        ResponseBase responseService=vueloService.agregarVuelo(vuelo);
        return responseService;
    }


    @GetMapping("/api/v1/vuelo/get/{id}")
    public ResponseBase obtener(@PathVariable Integer id){
        ResponseBase responseService=vueloService.buscarVuelo(id);
        return responseService;
    }
}
