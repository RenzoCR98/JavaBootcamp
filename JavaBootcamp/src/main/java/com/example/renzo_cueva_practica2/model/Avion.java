package com.example.renzo_cueva_practica2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "avion")
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "avion_id")
    private Integer id;
    private String modelo;
    @Column(name = "capacidad_pasajeros")
    private Integer capacidad;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "aerolinea_id_fk")
    private Aerolinea aerolinea;

    @OneToMany(mappedBy = "avion")
    private List<Vuelo> vuelos;
}
