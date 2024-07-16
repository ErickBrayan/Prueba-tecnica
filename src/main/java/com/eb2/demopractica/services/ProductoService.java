package com.eb2.demopractica.services;

import com.eb2.demopractica.entities.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> obtenerProductos();

    Producto guardarProducto(Producto producto);

    Producto actualizarProducto(Producto producto, Integer id);

    void eliminarProducto(Integer id);
}
