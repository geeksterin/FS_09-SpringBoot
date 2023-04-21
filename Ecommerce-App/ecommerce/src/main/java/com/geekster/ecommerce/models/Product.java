package com.geekster.ecommerce.models;

public class Product {

    private String productId;
    private String productName;
    private String price;
    //todo use  - ENUM instead of String...to get fixed types of category...your choice !!
    private String category;

    //todo
    //what happens when no setters in general : json to java object convert issues or not ?? Deserializable


    public Product(String productId, String productName, String price, String category) {

        System.out.println("product constructor is called!!!");

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
