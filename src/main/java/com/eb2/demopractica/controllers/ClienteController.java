package com.eb2.demopractica.controllers;

import com.eb2.demopractica.entities.Cliente;
import com.eb2.demopractica.services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getAllClientes() {
        return ResponseEntity.ok(clienteService.obtenerClientes());
    }

    @PostMapping
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.guardarCliente(cliente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateProducto(@RequestBody Cliente cliente, @PathVariable Long id){
        Cliente clienteEncontrado = clienteService.actualizarCliente(cliente,id);
        if (clienteEncontrado == null ){
            ResponseEntity.notFound();
        }
        return ResponseEntity.ok(clienteEncontrado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProducto(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
        return ResponseEntity.ok("Cliente Eliminado");
    }
}
