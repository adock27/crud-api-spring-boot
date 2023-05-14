package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.EstudianteModel;
import com.example.demo.repositories.EstudianteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;

    public ArrayList<EstudianteModel> getStudents() {
        return (ArrayList<EstudianteModel>) estudianteRepository.findAll();
    }

    public EstudianteModel saveStudent(EstudianteModel estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public Optional<EstudianteModel> getById(Integer id) {
        return estudianteRepository.findById(id);
    }

   
    public boolean deleteStudentById(Integer id) {
        try {
            estudianteRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    public boolean deleteStudentByCedula(Integer id) {
        try {
            estudianteRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public ArrayList<EstudianteModel> getByUniversidad(String id) {
        return (ArrayList<EstudianteModel>) estudianteRepository.findByUniversidad(id);
    }
    public ArrayList<EstudianteModel> getByCedula(String id) {
        return (ArrayList<EstudianteModel>) estudianteRepository.findByCedula(id);
    }


   

    
}
