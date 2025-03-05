package com.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sf=new Configuration()
                .addAnnotatedClass(com.telusko.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session= sf.openSession();
//        Laptop l1 = session.get(Laptop.class, 4);
//        System.out.println(l1);


//                  Fetching Data using HQL

//        From Laptop where Ram="32Gb"          ->> HQL Query

//        String brand="Asus";
////        String Ram="16Gb";
//        Query query=session.createQuery("Select brand,model from Laptop where brand Like ?1");
//        query.setParameter(1,brand);
//        List <Object[]> laptops = query.getResultList();
//        System.out.println(laptops);
//        for(Object[] d:laptops){
//            System.out.println((String) d[0]+" "+(String)d[1]);
//        }

//        Laptop l1=session.load(Laptop.class,2);// Deprecated
//        System.out.println(l1);

        Laptop laptop = session.byId(Laptop.class).getReference(1);
//        System.out.println(laptop);

        session.close();
        sf.close();


    }
}
