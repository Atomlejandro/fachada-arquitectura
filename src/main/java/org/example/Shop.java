package org.example;

public class Shop {
    private Product product;
    private Card card;

    // Elimina este constructor o asegúrate de que también inicialice las dependencias
    // public Shop() { }

    public Shop(Product product, Card card) {
        this.product = product;
        this.card = card;
    }

    public void processOrder(String productID, int quantity, String cardNumber, double price) {
        if (product.productExistence(productID) && card.cardExist(cardNumber)) {
            if (product.productQuantity(productID) >= quantity && card.getCardBalance(cardNumber) >= price) {
                product.deductStock(productID, quantity);
                card.discountBalance(cardNumber, price);
                System.out.println("Orden procesada");
            } else {
                System.out.println("No hay inventario suficiente o saldo insuficiente.");
            }
        } else {
            System.out.println("Producto o tarjeta no existe.");
        }
    }
}
