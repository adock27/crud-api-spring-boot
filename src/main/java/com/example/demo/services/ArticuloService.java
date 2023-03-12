package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.ArticuloModel;
import com.example.demo.repositories.ArticuloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloService {
    @Autowired
    ArticuloRepository articuloRepository;

    public ArrayList<ArticuloModel> getArticles() {
        return (ArrayList<ArticuloModel>) articuloRepository.findAll();
    }

    public long count() {
        return (long) articuloRepository.count();
    }

    public ArticuloModel saveArticle(ArticuloModel articulo) {
        return articuloRepository.save(articulo);
    }

    public Optional<ArticuloModel> getById(Integer id) {
        return articuloRepository.findById(id);
    }

   
    public boolean deleteArticleById(Integer id) {
        try {
            articuloRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public ArrayList<ArticuloModel> getByNombre(String id) {
        return (ArrayList<ArticuloModel>) articuloRepository.findByNombre(id);
    }
    public ArrayList<ArticuloModel> getByCategoria(String id) {
        return (ArrayList<ArticuloModel>) articuloRepository.findByCategoria(id);
    }
    public ArrayList<ArticuloModel> getByFecha(String id) {
        return (ArrayList<ArticuloModel>) articuloRepository.findByFecha(id);
    }


   

    
}
