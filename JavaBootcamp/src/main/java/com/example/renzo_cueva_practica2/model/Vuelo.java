package com.example.renzo_cueva_practica2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "vuelo")
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vuelo_id")
    private Integer id;
    @Column(name = "fecha_salida")
    private Date fechasalida;
    @Column(name = "fecha_llegada")
    private Date fechallegada;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "avion_id_fk")
    private Avion avion;

    @ManyToMany
    @JoinTable(name = "piloto_vuelo",
            joinColumns = @JoinColumn(name = "vuelo_id_fk"),
            inverseJoinColumns = @JoinColumn(name = "piloto_id_fk")
    )
    private List<Piloto> pilotos;

    @OneToMany(mappedBy = "vuelo")
    private List<Reserva> reservas;
}
