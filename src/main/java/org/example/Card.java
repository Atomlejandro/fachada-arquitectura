package org.example;

public abstract class Card {
    public abstract boolean cardExist(String cardNumber);
    public abstract double getCardBalance(String cardNumber);
    public abstract void discountBalance(String cardNumber, double amount);


}