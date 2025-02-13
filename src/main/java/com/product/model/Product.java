package com.product.model;

public class Product {
    private int id;
    private String name;
    private String description;
    private int qty;
    private double unitPrice;
    private String category;

    public Product () {}

    public Product (int id, String name, String description, int qty, double unitPrice, String category) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.category = category;
    }

    public int getId () { return this.id; }

    public String getName() { return this.name; }
    public void setName( String name ) { this.name = name; }

    public String getDescription() { return this.description; }
    public void setDescription( String description ) { this.description = description; }

    public double getUnitPrice() { return this.unitPrice; }
    public void setUnitPrice( String description ) { this.unitPrice = unitPrice; }

    public int getQty() { return this.qty; }
    public void setQty( int qty ) { this.qty = qty; }

    public String getCategory() { return this.category; }
    public void setCategory( String category ) { this.category = category; }

}
