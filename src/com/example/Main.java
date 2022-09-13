package com.example;

public class Main {
    public static void main(String[] args) {
        float price = 1500.00f;
        float priceIVA = getPriceIVA(price);

        System.out.println("The price is: " + price);
        System.out.println("Price + IVA: " + priceIVA);
    }

    public static float getPriceIVA (float price) {
        return (float) (price * 1.16);
    }
}
