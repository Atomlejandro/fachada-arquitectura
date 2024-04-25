package org.example;

public class ProductService extends Product {
    @Override
    public boolean productExistence(String productID){


        return true;
    }

    @Override
    public int productQuantity(String productID) {
        return 100;
    }

    @Override
    public void deductStock(String productID, int quantity) {
        System.out.println("Se descuenta: "+ quantity + " de: " + productID);
    }
}
