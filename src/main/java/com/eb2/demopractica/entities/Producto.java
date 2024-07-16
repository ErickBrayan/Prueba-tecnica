package com.eb2.demopractica.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;
    private String descripcion;
    private Integer cantidad;
    private byte estado;

    public Producto() {
    }

    public Producto(Integer id_producto, String descripcion, Integer cantidad, byte estado) {
        this.id_producto = id_producto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }
}
