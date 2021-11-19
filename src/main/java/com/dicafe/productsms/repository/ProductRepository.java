package com.dicafe.productsms.repository;

import com.dicafe.productsms.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Long> {

}
