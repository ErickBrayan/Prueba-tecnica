package com.eb2.demopractica.services;

import com.eb2.demopractica.entities.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> obtenerClientes();

    Cliente guardarCliente(Cliente cliente);

    Cliente actualizarCliente(Cliente cliente, Long id);

    void eliminarCliente(Long id);
}
