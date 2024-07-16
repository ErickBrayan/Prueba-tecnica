package com.eb2.demopractica.services;

import com.eb2.demopractica.entities.Venta;

import java.util.List;

public interface VentaService {

    List<Venta> obtenerVentas();


    Venta guardarVenta(Venta venta);

    Venta actualizarVenta(Venta venta,Long id);

    void eliminarVenta(Long id);

}
