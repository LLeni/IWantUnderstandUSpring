package ru.patrakov.IWantUnderstandU.springweb;

import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public class AccountRepository  {

    public static void insert(Account ac){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();

        session.persist(ac);

        session.getTransaction().commit();
    }

    public  static  void update(Account ac){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();

        session.saveOrUpdate(ac);

        session.getTransaction().commit();
    }

    public static void delete(int id){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();

        Account account = (Account) session.get(Account.class, id);

        session.delete(account);

        session.getTransaction().commit();
    }

    public static  Account get(int id){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();

        Account account = session.get(Account.class, id);

        session.getTransaction().commit();

        return  account;
    }



   // @Query("SELECT EXTRACT(YEAR FROM created_on) FROM Account where username = :username")
   // boolean isExistTwoYear(String username);
}
