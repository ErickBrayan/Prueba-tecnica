package com.eb2.demopractica.services.impl;

import com.eb2.demopractica.entities.Producto;
import com.eb2.demopractica.repository.ProductoRepository;
import com.eb2.demopractica.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto, Integer id) {
        Optional<Producto> productodb = productoRepository.findById(id);

        if (productodb.isPresent()) {
            return productoRepository.save(producto);
        }

        return null;
    }

    @Override
    public void eliminarProducto(Integer id) {
        productoRepository.deleteById(id);
    }
}
