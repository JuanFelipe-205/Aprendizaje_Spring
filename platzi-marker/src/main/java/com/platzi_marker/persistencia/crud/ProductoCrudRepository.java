package com.platzi_marker.persistencia.crud;

import com.platzi_marker.persistencia.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> { /// <NombreClase, TipoDeDatoPK>

    /// Query params
    /// @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)

    /// Query method
    List<Producto> findByIdCategoriaOrderByNombreAsc (int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
