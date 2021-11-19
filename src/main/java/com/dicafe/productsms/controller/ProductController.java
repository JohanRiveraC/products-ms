package com.dicafe.productsms.controller;

import com.dicafe.productsms.entity.Product;
import com.dicafe.productsms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ferney.Estupinan
 * Date: 18/11/2021
 */

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @GetMapping
    public List<Product> getAll(){
        return  productService.getAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable long id){
        return productService.getById(id);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable long id, @RequestBody Product product){
        return productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        productService.delete(id);
    }

}
