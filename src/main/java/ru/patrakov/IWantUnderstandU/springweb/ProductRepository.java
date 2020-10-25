package ru.patrakov.IWantUnderstandU.springweb;

import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public class ProductRepository{

    public static void insert(Product pr){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();

        session.persist(pr);

        session.getTransaction().commit();
    }

    public  static  void update(Product pr){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();

        session.saveOrUpdate(pr);

        session.getTransaction().commit();
    }

    public static void delete(int id){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();

        Product product = (Product) session.get(Product.class, id);

        session.delete(product);

        session.getTransaction().commit();
    }

    public static  Product get(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();

        Product product = session.get(Product.class, id);

        session.getTransaction().commit();

        return product;
    }
}
