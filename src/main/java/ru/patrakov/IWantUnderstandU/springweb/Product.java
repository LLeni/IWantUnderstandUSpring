package ru.patrakov.IWantUnderstandU.springweb;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    public Product(int product_id, String name, String creator, String released_on, int price, String description){
        this.product_id = product_id;
        this.creator = creator;
        this.name = name;
        this.released_on =released_on;
        this.price = price;
        this.description = description;
    }

    @Id
    @OneToMany
    @JoinColumn(name = "product_id")
    private int product_id;

    @Column(name = "name")
    private String name;

    @Column(name = "creator")
    private String creator;

    @Column(name = "released_on")
    private String released_on;

    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;

    public int getProduct_id() {
        return product_id;
    }

    public String getName() {
        return name;
    }

    public String getCreator() {
        return creator;
    }

    public String getReleased_on() {
        return released_on;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
