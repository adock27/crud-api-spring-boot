package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.ArticuloModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepository extends CrudRepository<ArticuloModel, Integer>{
    public abstract Optional<ArticuloModel> findById(Integer id);

    public abstract ArrayList<ArticuloModel> findByNombre(String id);
    public abstract ArrayList<ArticuloModel> findByCategoria(String id);
    public abstract ArrayList<ArticuloModel> findByFecha(String id);


}
