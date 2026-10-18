package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class productService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;


    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(Long Id){
        for (Product product : products){
            if (product.getId().equals(id)){
                return product;
            }
        }
    }


    public Product addProduct(Product product) {
        product.setId(nextId++); // use the value, then add one
        products.add(product);
        return product;


    }
}