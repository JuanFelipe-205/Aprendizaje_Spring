package com.platzi_marker.persistencia;


import com.platzi_marker.domain.Purchase;
import com.platzi_marker.domain.repository.PurchaseRepository;
import com.platzi_marker.persistencia.crud.CompraCurdRespository;
import com.platzi_marker.persistencia.entity.Compra;
import com.platzi_marker.persistencia.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository /// Se va a comunicar con la Base de datos
public class CompraRepository implements PurchaseRepository {

    @Autowired
    private CompraCurdRespository compraCurdRespository;

    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCurdRespository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCurdRespository.findByIdCliente(clientId)
                .map(compras -> mapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        compra.getProductos().forEach(producto -> producto.setCompra(compra));
        return mapper.toPurchase(compraCurdRespository.save(compra));
    }
}
