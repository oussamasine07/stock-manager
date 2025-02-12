package com.product.model;

public class Product {
    private int id;
    private String name;
    private String description;
    private int qty;
    private String unitPrice;
    private String category;

    public Product () {}

    public Product (String name, String description, int qty, String unitPrice, String category) {
        super();
        this.name = name;
        this.description = description;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.category = category;
    }

    public String getName() { return this.name; }
    public void setName( String name ) { this.name = name; }

    public String getDescription() { return this.description; }
    public void setDescription( String description ) { this.description = description; }

    public String getUnitPrice() { return this.unitPrice; }
    public void setUnitPrice( String description ) { this.unitPrice = unitPrice; }

    public int getQty() { return this.qty; }
    public void setQty( int qty ) { this.qty = qty; }

    public String getCategory() { return this.category; }
    public void setCategory( String category ) { this.category = category; }

}
