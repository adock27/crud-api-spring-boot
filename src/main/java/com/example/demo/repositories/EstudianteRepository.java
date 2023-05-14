package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.EstudianteModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends CrudRepository<EstudianteModel, Integer>{
    public abstract Optional<EstudianteModel> findById(Integer id);

    public abstract ArrayList<EstudianteModel> findByUniversidad(String id);
    public abstract ArrayList<EstudianteModel> findByCedula(String id);


}
