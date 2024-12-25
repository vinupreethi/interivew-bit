package org.Ecommerce.searchServices;

import org.Ecommerce.models.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchClothingProducts implements Search {
    List<Product> clothingList=new ArrayList<>();
    @Override
    public List<Product> sortByLowToHighPrice() {
        Collections.sort(clothingList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        return clothingList;
    }

    @Override
    public List<Product> sortByHighToLowPrice() {
        Collections.sort(clothingList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        return clothingList;

    }

    @Override
    public List<Product> sortByBrand() {
        Collections.sort(clothingList, new Comparator<Product>() {

            @Override
            public int compare(Product product1, Product product2) {
                return product1.getBrand().compareTo(product2.getBrand());
            }

        });
        return clothingList;
    }

    @Override
    public List<Product> sortByCustomerReviews() {
        Collections.sort(clothingList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getRating() - o2.getRating());
            }
        });
        return clothingList;
    }
}
