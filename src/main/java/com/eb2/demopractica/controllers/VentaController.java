package com.eb2.demopractica.controllers;

import com.eb2.demopractica.entities.Producto;
import com.eb2.demopractica.entities.Venta;
import com.eb2.demopractica.services.VentaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/venta")
public class VentaController {

    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @GetMapping
    public ResponseEntity<List<Venta>> getAll(){
        return ResponseEntity.ok(ventaService.obtenerVentas());
    }

    @PostMapping
    public ResponseEntity<Venta> guardarVenta(@RequestBody Venta venta) {
        return ResponseEntity.ok(ventaService.guardarVenta(venta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Venta> actualizarVenta( @RequestBody Venta venta, @PathVariable Long id) {
        Venta venta1 = ventaService.actualizarVenta(venta,id);
        if (venta1 == null ){
            ResponseEntity.notFound();
        }
        return ResponseEntity.ok(venta1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarVenta(@PathVariable Long id) {
        ventaService.eliminarVenta(id);
        return ResponseEntity.ok("Venta Eliminada");
    }

}
