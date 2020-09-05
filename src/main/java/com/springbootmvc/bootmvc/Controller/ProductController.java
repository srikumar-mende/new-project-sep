package com.springbootmvc.bootmvc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbootmvc.bootmvc.model.Product;
import com.springbootmvc.bootmvc.serviuce.ProductService;
@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	@RequestMapping("/a")
	public String viewHomePage(Model model) {
	    List<Product> listProducts = service.listAll();
	    model.addAttribute("listProducts", listProducts);
	     System.out.println("from home controller");
	    return "index";
	}
	
	@RequestMapping("/newProduct")
	public String showNewProductPage(ModelMap model) {
		System.out.println("from show product controller");
	    model.addAttribute("product", new Product());
	    return "newProduct";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
	    service.save(product);
	     
	    return "redirect:/";
	}
	}
