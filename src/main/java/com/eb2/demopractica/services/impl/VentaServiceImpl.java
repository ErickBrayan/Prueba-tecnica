package com.eb2.demopractica.services.impl;

import com.eb2.demopractica.entities.Venta;
import com.eb2.demopractica.repository.VentaRepository;
import com.eb2.demopractica.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta> obtenerVentas() {
        return ventaRepository.findAll();
    }

    @Override
    public Venta guardarVenta(Venta venta) {
        return ventaRepository.save(venta);

    }

    @Override
    public Venta actualizarVenta(Venta venta, Long id) {
        Optional<Venta> ventadb = ventaRepository.findById(id);
        if (ventadb.isPresent()){
            ventaRepository.save(venta);
        }
        return null;
    }

    @Override
    public void eliminarVenta(Long id) {
        ventaRepository.deleteById(id);
    }
}
