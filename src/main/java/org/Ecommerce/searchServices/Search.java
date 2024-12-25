package org.Ecommerce.searchServices;

import org.Ecommerce.models.Product;

import java.util.List;

public interface Search {

     List<Product> sortByLowToHighPrice();
     List<Product> sortByHighToLowPrice();
     List<Product> sortByBrand();
     List<Product> sortByCustomerReviews();


}
