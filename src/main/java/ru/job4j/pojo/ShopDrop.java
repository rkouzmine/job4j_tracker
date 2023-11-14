package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            if (i == index) {
                products[i] = null;
            }
            for (int j = 0; j < products.length - 1; j++) {
                if (products[j] == null) {
                    products[j] = products[j + 1];
                    products[j + 1] = null;
                }
            }
        }
        return products;
    }
}