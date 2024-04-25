package org.example;

public abstract class Product {
    public abstract boolean productExistence(String productID);

    public abstract int productQuantity(String productID);

    public abstract void deductStock(String productID, int quantity);
}