package service.impl;

import model.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Rolls-Royce",28000000.0,
                "Boat Tail","England"));
        products.put(2,new Product(2,"Bugatti",18900000.0,
                "La Voiture Noire","Frank"));
        products.put(3,new Product(3,"Mercedes",8000000.0,
                "Maybach Exelero","Germany"));
        products.put(4,new Product(4,"Koenigsegg",4800000.0,
                "CCXR Trevita","Sweden"));
        products.put(5,new Product(5,"Lamborghini",4500000.0,
                "Veneno Roadster","Italy"));
        products.put(6, new Product(6, "Bentley", 1800000.0,
                "Continental 2021", "England"));
        products.put(7, new Product(7, "Tesla", 1154000.6,
                "Tesla Model 3", "USA"));
        products.put(8, new Product(8, "Subaru", 1598000.0,
                "Subaru XV", "Japan"));
        products.put(9, new Product(9, "Audi", 4500000.0,
                "Audi Q8", "Germany"));
        products.put(10, new Product(10, "Mazda", 750000.0,
                "Mazda 3", "Japan"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> products = this.findAll();
        List<Product> productResult = new ArrayList<>();
        String productName;
        name = name.toLowerCase();
        for(Product product : products) {
            productName = product.getName().toLowerCase();
            if (productName.contains(name)){
                productResult.add(product);
            }
        }
        return productResult;
    }
}
