package org.Ecommerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchHomeAndKitchenProducts implements Search {
    List<Product> kitchenList=new ArrayList<>();

    @Override
    public  List<Product> sortByLowToHighPrice() {
        Collections.sort(kitchenList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        return  kitchenList;
    }

    @Override
    public  List<Product> sortByHighToLowPrice() {
        Collections.sort(kitchenList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        return  kitchenList;
    }

    @Override
    public  List<Product> sortByBrand() {
        Collections.sort(kitchenList, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return product1.getBrand().compareTo(product2.getBrand());
            }
        });
        return  kitchenList;
    }

    @Override
    public  List<Product> sortByCustomerReviews() {
        Collections.sort(kitchenList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getRating() - o2.getRating();
            }
        });
        return  kitchenList;
    }


}
