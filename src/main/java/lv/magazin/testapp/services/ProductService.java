package lv.magazin.testapp.services;

import lv.magazin.testapp.domain.Product;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    private Map<Long, Product> products;

    @PostConstruct
    public void init() {
        products = new HashMap<Long, Product>();
        put(new Product("Bed", 1, 950, 2));
        put(new Product("Nightstand", 2, 100, 2));
        put(new Product("Table", 3, 200, 1));
        put(new Product("Stool", 4, 40, 1));
        put(new Product("Refrigerator", 5, 430, 1));
        put(new Product("Bath", 6, 300, 3));
        put(new Product("coffee table", 7, 120, 4));
    }

    private void put(Product product) {
        if (products.containsKey(product.getProductId())) {
            throw new IllegalArgumentException("Product id already exist " + product.getCategoryId());
        }
        products.put(product.getProductId(), product);
    }

    public List<Product> getAllByCategory(long categoryId) {
        List<Product> categoryProducts = new ArrayList<Product>();
        for (Map.Entry entry : products.entrySet()) {
            Product value = (Product) entry.getValue();
            if (value.getCategoryId() == categoryId) {
                categoryProducts.add(value);
            }
        }
        return categoryProducts;
    }


    public Product getProductById(Long productIndex) {
        if (products.containsKey(productIndex)) {
            return products.get(productIndex);
        }
        return null;
    }
}
