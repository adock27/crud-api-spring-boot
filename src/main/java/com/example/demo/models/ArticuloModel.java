package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "articulos")
public class ArticuloModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private int id;
    private String nombre;
    private String marca;
    private String precioventa;
    private String preciocompra;
    private String iva;
    private String modelo;
    private String proveedor;
    private String tienda;
    private String cantidad;
    private String descripcion;
    private String categoria;
    private String fecha;
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "id", nullable = false)
    @JsonIgnoreProperties("articulos")
    @ManyToOne(optional = false)
    private EstudianteModel usuario_id;

}
