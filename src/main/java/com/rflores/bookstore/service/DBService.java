package com.rflores.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rflores.bookstore.domain.Categoria;
import com.rflores.bookstore.domain.Livro;
import com.rflores.bookstore.repositories.CategoriaRepository;
import com.rflores.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	@Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informatica", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Romance", "Livros de Romance");
		Categoria cat3 = new Categoria(null, "Científico", "Livros de Ciências");

        Livro l1 = new Livro (null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
        Livro l2 = new Livro (null, "A Seleção", "Kiera Kass", "Lorem ipsum", cat2);
        Livro l3 = new Livro (null, "A vida segundo Hawking", "Stephen Hawking", "Lorem ipsum", cat3);
        Livro l4 = new Livro (null, "Jarbas", "Robert Junior", "Lorem ipsum", cat3);
        Livro l5 = new Livro (null, "Romerio e Pereba", "William Cheio de pelos", "Lorem ipsum", cat2);
        
        cat1.getLivros().addAll(Arrays.asList(l1));
        cat2.getLivros().addAll(Arrays.asList(l2, l5));
        cat3.getLivros().addAll(Arrays.asList(l3, l4));
        
        this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}
}
