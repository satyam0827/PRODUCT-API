package com.satyam.api_test.Controller;

import com.satyam.api_test.Model.Product;
import com.satyam.api_test.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    ProductService service;
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String homePage(){
        return "Your backend server is live!";
    }

    @GetMapping("/products")
    public List<Product> getProduct(){
        return service.getProduct();
    }

    @GetMapping("/product/{prodId}")
    public Product getProductById(@PathVariable("prodId") int id){
        return service.getProductById(id);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
      return  service.addProduct(product);
    }

    @PutMapping("/product/{prodId}")
    public Product updateProduct(@PathVariable int prodId, @RequestBody Product product){
        return service.updateProduct(prodId, product);
    }


    @DeleteMapping("/product/{prodId}")
    public  void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
