package com.springboot.application.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "city")
    private String city;

    // one customer has one products
   /* @OneToOne(targetEntity = Product.class, cascade = CascadeType.ALL)
    private Product product;*/

    // one customer has many products
    /*@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "foreign_key", referencedColumnName = "id")
    private List<Product> product;*/

    @ManyToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    private List<Product> product;

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
