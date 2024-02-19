package com.example.renzo_cueva_practica2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pasajero")
public class Pasajero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pasajero_id")
    private Integer id;
    private String nombre;
    private String apellido;
    private Boolean estado;

    @OneToMany(mappedBy = "pasajero")
    private List<Reserva> reservas;
}
