package org.example;

public class Main {
    public static void main(String[] args) {
        Product product = new ProductService();
        Card card = new CardService();
            Shop shop = new Shop(product,card);

            shop.processOrder("123456",10,"126548",150.0);


    }
}