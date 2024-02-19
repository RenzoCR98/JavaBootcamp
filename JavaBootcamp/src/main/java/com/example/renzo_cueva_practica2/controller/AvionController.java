package com.example.renzo_cueva_practica2.controller;

import com.example.renzo_cueva_practica2.model.Avion;
import com.example.renzo_cueva_practica2.response.ResponseBase;
import com.example.renzo_cueva_practica2.service.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AvionController {
    @Autowired
    private AvionService avionService;

    @PostMapping("/api/v1/avion/save")
    public ResponseBase create(@RequestBody Avion avion){
        ResponseBase responseService=avionService.agregarAvion(avion);
        return responseService;
    }


    @GetMapping("/api/v1/avion/get/{id}")
    public ResponseBase obtener(@PathVariable Integer id){
        ResponseBase responseService=avionService.buscarAvion(id);
        return responseService;
    }

}
