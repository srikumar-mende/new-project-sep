package com.springbootmvc.bootmvc.serviuce;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootmvc.bootmvc.model.Product;
import com.springbootmvc.bootmvc.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;

	public List<Product> listAll() {
        return repo.findAll();
    }
     
    public void save(Product product) {
        repo.save(product);
    }
     
    public Product get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }

}
