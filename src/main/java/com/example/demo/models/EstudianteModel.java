package com.example.demo.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "Estudiante")
public class EstudianteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String semestre;
    private String email;
    private String genero;
    private String teléfono;
    private String programa;
    private String universidad;
    @JsonIgnoreProperties(value = "id")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private List<ArticuloModel> articulos;

  
}
