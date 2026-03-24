package com.satyam.api_test.Service;

import com.satyam.api_test.Model.Product;
import com.satyam.api_test.Repository.ProductRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProduct(){
        return productRepository.findAll();
    }

    public Product getProductById(int id){
        System.out.println("your product Id is " + id);
        return productRepository.findById(id).orElse(new Product());
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(int id, Product product) {
       Product existingProduct = productRepository.findById(id).orElseThrow(() -> new RuntimeException("product not found with product id "+ id));
       existingProduct.setProdName(product.getProdName());
       existingProduct.setProdPrice(product.getProdPrice());
       return productRepository.save(existingProduct);
    }

    public void deleteProduct(int prodId) {
        productRepository.deleteById(prodId);
    }
}
