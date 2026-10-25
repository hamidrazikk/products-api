package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;


    public ProductService() {
        products.add(new DigitalProduct(nextId++, "Clean Code (E-book)", 29.99,"/downloads/clean-code.pdf", 4.2));
        
        
        
        products.addd(new PhysicalProduct(nextId++, "27-inch Monitor", 249.99,5.4, "61cm x 41cm x 18cm"));
    }




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