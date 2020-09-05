package com.springbootmvc.bootmvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootmvc.bootmvc.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{

}
