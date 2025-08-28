package com.platzi_marker.persistencia;

import com.platzi_marker.persistencia.crud.ProductoCrudRepository;
import com.platzi_marker.persistencia.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository /// Esta anotacion permite identificar que esta clase interactua con la BD
public class productRespoitory {
    /// Atributo
    private ProductoCrudRepository productoCrudRepository;

    /// Metodos
    public List<Producto> getAll(){
        /**
         * 1. Invoca la interfaz "productoCrudRepository"
         * 2. Como lainterfaz extiende una clase externa usa sus metodos
         * "Como esta clase ya definio la tabla y el ID no se realiza este paso"
         * 3. Invoca el metodo "findAll()"
         * 4. Castea el resultado anterior a una Lista de productos
         */
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save (Producto producto){
        return productoCrudRepository.save(producto);
    }

    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
