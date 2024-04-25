package org.example;

public class CardService extends Card {

    @Override
    public boolean cardExist(String cardNumber) {
        return true;
    }

    @Override
    public double getCardBalance(String cardNumber) {
        return 1500.0;
    }

    @Override
    public void discountBalance(String cardNumber, double amount) {
        System.out.println("Se ha descontado: "+ amount + "de: " + cardNumber);
    }
}
