package com.example.renzo_cueva_practica2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "piloto")
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "piloto_id")
    private Integer id;
    private String nombre;
    private String apellido;
    private Boolean estado;

    @ManyToMany(mappedBy = "pilotos")
    private List<Vuelo> vuelos;
}