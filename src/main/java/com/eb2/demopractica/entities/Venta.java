package com.eb2.demopractica.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Ventas")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_venta;
    private Date fecha;
    private String serie;
    private String numero;
    private Double total;

    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<DetalleVentas> detalleVentas;


    public Venta() {
    }

    public Venta(Long id_venta, Date fecha, String serie, String numero, Double total, Cliente cliente, List<DetalleVentas> detalleVentas) {
        this.id_venta = id_venta;
        this.fecha = fecha;
        this.serie = serie;
        this.numero = numero;
        this.total = total;
        this.cliente = cliente;
        this.detalleVentas = detalleVentas;
    }

    public Long getId_venta() {
        return id_venta;
    }

    public void setId_venta(Long id_venta) {
        this.id_venta = id_venta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleVentas> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(List<DetalleVentas> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }

    @PrePersist
    public void prePersist() {
        fecha = new Date();
        serie = UUID.randomUUID().toString();
    }
}
