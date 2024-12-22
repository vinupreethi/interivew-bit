package org.Ecommerce;


public class DeliveryAgent extends Seller {
    private Seller seller;

    public DeliveryAgent(String Sellername, String password) {
        super(Sellername, password);
    }

    public DeliveryAgent(String sellername, String password, String phoneNumber, String emailId, Address address) {
        super(sellername, password, phoneNumber, emailId, address);
    }

    public void deliverProduct(Product product) {
        product.setOrderStatus(OrderStatus.DELIVERED);
        if (product.getPaymentMode().equals(PaymentMode.CASH_ON_DELIVERY)) {
            System.out.println("Seller needs to pay on delivery");
        }
    }

    public void cancelProduct(Product product, Buyer buyer) throws InSufficientBalanceException {
        System.out.println("If Seller wants to cancel the product at doorStep");
        product.setOrderStatus(OrderStatus.CANCELLED);
        seller.initiateRefund(product, buyer);
    }
}
