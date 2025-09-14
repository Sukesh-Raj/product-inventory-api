    package com.spring.ProductInventory.entity;

    import jakarta.persistence.*;

    @Entity
    @Table(name = "products")
    public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "product_id")
        private int id;

        @Column(name = "product_name")
        private String productName;

        @Column(name = "description")
        private String description;

        @Column(name = "quantity")
        private int quantity;

        @Column(name = "price")
        private double price;

        public Product()
        {

        }

        public Product(String productName, String description, int quantity, double price) {
            this.productName = productName;
            this.description = description;
            this.quantity = quantity;
            this.price = price;
        }

        public Product(int id, String productName, String description, int quantity, double price) {
            this.id = id;
            this.productName = productName;
            this.description = description;
            this.quantity = quantity;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
