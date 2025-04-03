package com.example.biblioteca.repository;

import com.example.biblioteca.model.LibroModel;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    private List<LibroModel> listaLibros = new ArrayList<>();

    @PostConstruct
    public void init(){
        listaLibros.add(new LibroModel(2,"978-1617294945","Spring in action","Addison-Wesley", 2018,"Joshua Bloch"));
    }

}
