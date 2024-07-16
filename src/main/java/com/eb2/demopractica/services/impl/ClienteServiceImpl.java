package com.eb2.demopractica.services.impl;

import com.eb2.demopractica.entities.Cliente;
import com.eb2.demopractica.repository.ClienteRepostory;
import com.eb2.demopractica.services.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepostory clienteRepostory;

    public ClienteServiceImpl(ClienteRepostory clienteRepostory) {
        this.clienteRepostory = clienteRepostory;
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return clienteRepostory.findAll();
    }

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepostory.save(cliente);
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente, Long id) {
        Optional<Cliente> clientedb = clienteRepostory.findById(id);


        if (clientedb.isPresent()) {
            return clienteRepostory.save(cliente);
        }

        return null;
    }

    @Override
    public void eliminarCliente(Long id) {
        clienteRepostory.deleteById(id);
    }
}
