package ru.netology.product;
public class Product {
    protected String name;

    public Product(String name) {
        this.name = name;
    }
    private int price;

    private int id;


    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
