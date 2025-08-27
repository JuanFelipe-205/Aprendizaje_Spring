package com.platzi_marker.persistencia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity /// Anotacion usada para declarar que esta clase mapeara una tabla en la BD.
@Table(name = "clientes") /// Esto permite identificar el nombre de la Base y comprarla con la clase actial
public class Cliente {

    /// revisar PK
    @Column(name = "id")
    private String id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "celular")
    private Integer celular;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;
}
