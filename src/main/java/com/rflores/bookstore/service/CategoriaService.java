package com.rflores.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rflores.bookstore.repositories.CategoriaRepository;
import com.rflores.bookstore.domain.Categoria;
import com.rflores.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repository;
    
    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id:" + id + ", Tipo:" +Categoria.class.getName()));
        
    }
}