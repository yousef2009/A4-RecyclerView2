package com.example.a4_2.model;

public class Product {
    private int image;
    private String description;
    private String specifications;
    private double rate;
    private double price;

    public Product(int image, String description, String specifications, double rate, double price) {
        this.image = image;
        this.description = description;
        this.specifications = specifications;
        this.rate = rate;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
