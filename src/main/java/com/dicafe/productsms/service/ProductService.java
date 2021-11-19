package com.dicafe.productsms.service;

import com.dicafe.productsms.entity.Product;
import com.dicafe.productsms.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ferney.Estupinan
 * Date: 18/11/2021
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product create(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public Product getById(long id){
        var product = productRepository.findById(id);
        if (product.isPresent()) return product.get();
        return null;
    }

    public Product update(long id, Product product){
        return productRepository.save(product);
    }

    public void delete(long id){
        productRepository.deleteById(id);
    }

}
