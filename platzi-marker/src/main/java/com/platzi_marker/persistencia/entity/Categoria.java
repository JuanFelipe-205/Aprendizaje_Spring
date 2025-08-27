package com.platzi_marker.persistencia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity /// Anotacion usada para declarar que esta clase mapeara una tabla en la BD.
@Table(name = "compras") /// Esto permite identificar el nombre de la Base y comprarla con la clase actial
public class Categoria {

    /// revisar PK
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private Boolean estado;

}
