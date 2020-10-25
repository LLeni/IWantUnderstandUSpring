package ru.patrakov.IWantUnderstandU.springweb;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "basket")
public class Basket {

    private Set<Account> accounts;
    private Set<Product> products;


    public Basket(int basket_id, int user_id, int product_id, int count){
        this.basket_id = basket_id;
        this.user_id = user_id;
        this.product_id = product_id;
        this.count = count;
    }

    @Id
    private int basket_id;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private int user_id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private int product_id;

    @Column(name = "count")
    private int count;

    public int getBasket_id() {
        return basket_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getCount() {
        return count;
    }
}
