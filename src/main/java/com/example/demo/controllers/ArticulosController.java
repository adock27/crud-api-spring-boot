package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.example.demo.models.ArticuloModel;
import com.example.demo.services.ArticuloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("articulos")
public class ArticulosController {
    @Autowired
    ArticuloService articuloService;

    @GetMapping("")
    public ArrayList<ArticuloModel> getArticles() {
        return articuloService.getArticles();
    }

    @GetMapping("/contar")
    public Map<String, String> getCount() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Articles", Long.toString(articuloService.count()));
        return map;
    }

    @PostMapping("")
    public ArticuloModel saveArticle(@RequestBody ArticuloModel articulo) {
        return this.articuloService.saveArticle(articulo);
    }

    @GetMapping(path = "/{id}")
    public Optional<ArticuloModel> getArticleById(@PathVariable("id") Integer id) {
        return this.articuloService.getById(id);
    }

    @GetMapping("/nombre/{id}")
    public ArrayList<ArticuloModel> getArticleByNombre(@PathVariable("id") String id) {
        return articuloService.getByNombre(id);
    }

    @GetMapping("/categoria/{id}")
    public ArrayList<ArticuloModel> getArticleByCategoria(@PathVariable("id") String id) {
        return articuloService.getByCategoria(id);
    }
    @GetMapping("/fecha/{id}")
    public ArrayList<ArticuloModel> getArticleByFecha(@PathVariable("id") String id) {
        return articuloService.getByFecha(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") int id) {
        boolean ok = this.articuloService.deleteArticleById(id);
        if (ok) {
            return "Se eliminó el Articulo con ID: " + id;
        } else {
            return "No se pudo eliminar el Articulo con ID: " + id;
        }
    }
}
