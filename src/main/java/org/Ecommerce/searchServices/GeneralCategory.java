package org.Ecommerce.searchServices;

import org.Ecommerce.models.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GeneralCategory implements Search {
    private List<Product> productList=new ArrayList<>();
    @Override
    public List<Product> sortByLowToHighPrice() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        return productList;
    }

    @Override
    public List<Product> sortByHighToLowPrice() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        return productList;

    }

    @Override
    public List<Product> sortByBrand() {
        Collections.sort(productList, new Comparator<Product>() {

            @Override
            public int compare(Product product1, Product product2) {
                return product1.getBrand().compareTo(product2.getBrand());
            }

        });
        return productList;
    }

    @Override
    public List<Product> sortByCustomerReviews() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getRating() - o2.getRating());
            }
        });
        return productList;
    }
}
