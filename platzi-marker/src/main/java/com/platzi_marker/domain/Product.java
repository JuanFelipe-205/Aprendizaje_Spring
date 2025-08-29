package com.platzi_marker.domain;

public class Product {

    /// Atributos
    private int proudctId;
    private String name;
    private int idCategory;
    private double price;
    private int stock;
    private boolean active;
    private Category category ;

    /// Set y Get
    public int getProudctId() {
        return proudctId;
    }
    public void setProudctId(int proudctId) {
        this.proudctId = proudctId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getIdCategory() {
        return idCategory;
    }
    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}
