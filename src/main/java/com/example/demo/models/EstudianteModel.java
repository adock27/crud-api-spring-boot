package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Estudiante")
public class EstudianteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
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


    // public String getUniversidad() {
    //     return universidad;
    // }
    // public void setUniversidad(String universidad) {
    //     this.universidad = universidad;
    // }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getTeléfono() {
        return teléfono;
    }
    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }
    public String getPrograma() {
        return programa;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }
    public String getUniversidad() {
        return universidad;
    }
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    
}
