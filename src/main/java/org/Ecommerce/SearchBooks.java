package org.Ecommerce;

import java.awt.print.Book;
import java.util.*;

public class SearchBooks implements Search {
    List<Product> bookList = new ArrayList<>();

    @Override
    public List<Product> sortByLowToHighPrice() {
        Collections.sort(bookList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        return bookList;
    }

    @Override
    public List<Product> sortByHighToLowPrice() {
        Collections.sort(bookList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        return bookList;
    }

    @Override
    public List<Product> sortByBrand() {
        Collections.sort(bookList, new Comparator<Product>() {

            @Override
            public int compare(Product product1, Product product2) {
                return product1.getBrand().compareTo(product2.getBrand());
            }

        });
        return bookList;
    }

    @Override
    public List<Product> sortByCustomerReviews() {
        Collections.sort(bookList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getRating() - o2.getRating());
            }
        });
        return bookList;
    }
}
