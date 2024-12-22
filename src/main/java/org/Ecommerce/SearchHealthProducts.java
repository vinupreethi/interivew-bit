package org.Ecommerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchHealthProducts implements Search {
    List<Product> healthList=new ArrayList<>();
    @Override
    public List<Product> sortByLowToHighPrice() {
        Collections.sort(healthList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        return  healthList;
    }

    @Override
    public List<Product> sortByHighToLowPrice() {
        Collections.sort(healthList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        return  healthList;
    }

    @Override
    public List<Product> sortByBrand() {
        Collections.sort(healthList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });
        return  healthList;

    }

    @Override
    public List<Product> sortByCustomerReviews() {
        Collections.sort(healthList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getRating() - o2.getRating();
            }
        });
        return  healthList;
    }
}
