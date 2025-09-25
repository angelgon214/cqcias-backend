package com.example.cqcias_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Producto")
public class ProductoBusinessEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "producto")
    private String producto;

    @Column(name = "codigobarras")
    private Integer codigobarras;

    @Column(name = "marca")
    private String marca;

    @Column(name = "costo")
    private Double costo;

    @Column(name = "estatus")
    private String estatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCodigobarras() {
        return codigobarras;
    }

    public void setCodigobarras(Integer codigobarras) {
        this.codigobarras = codigobarras;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
