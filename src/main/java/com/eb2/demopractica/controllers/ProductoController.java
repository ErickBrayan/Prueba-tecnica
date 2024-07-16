package com.eb2.demopractica.controllers;

import com.eb2.demopractica.entities.Producto;
import com.eb2.demopractica.services.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/producto")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public ResponseEntity<List<Producto>> getAllProductos() {
        return ResponseEntity.ok(productoService.obtenerProductos());
    }

    @PostMapping
    public ResponseEntity<Producto> addProducto(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.guardarProducto(producto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> updateProducto(@RequestBody Producto producto, @PathVariable Integer id){
        Producto producto1 = productoService.actualizarProducto(producto,id);
        if (producto == null ){
            ResponseEntity.notFound();
        }
        return ResponseEntity.ok(producto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProducto(@PathVariable Integer id) {
        productoService.eliminarProducto(id);
        return ResponseEntity.ok("Producto Eliminado");
    }
}
