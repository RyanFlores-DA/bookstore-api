package com.rflores.bookstore;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.rflores.bookstore.repositories.CategoriaRepository;
import com.rflores.bookstore.repositories.LivroRepository;
import com.rflores.bookstore.domain.Categoria;
import com.rflores.bookstore.domain.Livro;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

@EntityScan(basePackages = "com.rflores.bookstore.domain")
@SpringBootApplication
public class BkstoreApplication implements CommandLineRunner{
    
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(BkstoreApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "Romance", "Livros de Romance");
        
        Livro l1 = new Livro (null, "A Seleção", "Kiera Kass", "Lorem ipsum", cat1);
        
        cat1.getLivros().addAll(Arrays.asList(l1));
        
        this.categoriaRepository.saveAll(Arrays.asList(cat1));
        this.livroRepository.saveAll(Arrays.asList(l1));
        
        
    }

}
