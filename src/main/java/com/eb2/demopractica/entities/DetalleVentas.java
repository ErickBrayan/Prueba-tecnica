package com.eb2.demopractica.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Detalle_Ventas")
public class DetalleVentas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detalle;
    private Integer cantidad;
    private Double precio;
    private Double subtotal;

    @ManyToOne
    private Producto producto;

    public DetalleVentas() {
    }

    public DetalleVentas(Long id_detalle, Integer cantidad, Double precio, Double subtotal, Producto producto) {
        this.id_detalle = id_detalle;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.producto = producto;
    }

    public Long getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(Long id_detalle) {
        this.id_detalle = id_detalle;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
