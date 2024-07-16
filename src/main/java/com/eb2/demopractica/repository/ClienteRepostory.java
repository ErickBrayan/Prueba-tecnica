package com.eb2.demopractica.repository;

import com.eb2.demopractica.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepostory extends JpaRepository<Cliente,Long> {
}
