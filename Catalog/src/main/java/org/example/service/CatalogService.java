package org.example.service;

import org.example.domain.Product;
import org.example.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CatalogService {

    @Autowired
    private CatalogRepository catalogRepository;

    public Product getProductById(Long id){
         return catalogRepository.findByUniqId(id).
                 orElseThrow(() -> new NoSuchElementException("Product with id: " + id + " not found"));
    }

}
