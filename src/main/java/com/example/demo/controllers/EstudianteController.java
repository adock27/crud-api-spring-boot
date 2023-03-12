package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.EstudianteModel;
import com.example.demo.services.EstudianteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("estudiantes")
public class EstudianteController {
    @Autowired
    EstudianteService estudianteService;

    @GetMapping("")
    public ArrayList<EstudianteModel> getStudents() {
        return estudianteService.getStudents();
    }

    @PostMapping("")
    public EstudianteModel saveStudent(@RequestBody EstudianteModel estudiante){
        return this.estudianteService.saveStudent(estudiante);
    }

    @GetMapping(path = "/{id}")
    public Optional<EstudianteModel> getStudentById(@PathVariable("id") Integer id) {
        return this.estudianteService.getById(id);
    }

    @GetMapping("/universidad/{id}")
    public ArrayList<EstudianteModel> getStudentByUniversidad(@PathVariable("id") String id) {
        return estudianteService.getByUniversidad(id);
    }

    @DeleteMapping(path = "/eliminar/{id}")
    public String deleteById(@PathVariable("id") int id){
        boolean ok  = this.estudianteService.deleteStudentById(id);
        if (ok) {
            return "Se eliminó el Estudiante con ID: "+ id;
        }else{
            return "No se pudo eliminar el Estudiante con ID: "+ id;
        }
    }
}
