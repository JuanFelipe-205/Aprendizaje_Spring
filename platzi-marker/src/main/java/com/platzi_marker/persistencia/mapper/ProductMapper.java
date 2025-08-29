package com.platzi_marker.persistencia.mapper;

import com.platzi_marker.domain.Product;
import com.platzi_marker.persistencia.entity.Producto;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProducto", target = "proudctId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "idCategory"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "categoria", target = "category"),
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto(Product product);
}
