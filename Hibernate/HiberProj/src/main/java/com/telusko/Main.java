package com.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Create
        /*
            Student s1 = new Student();
            s1.setsName("Nishant");
            s1.setRollNo(103);
            s1.setsAge(34);
        */

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.telusko.Student.class);
//        cfg.configure();
//
//        SessionFactory sf = cfg.buildSessionFactory();
//        Session session = sf.openSession();
//        Transaction transaction = session.beginTransaction();
        // Create
//        session.save(s1);
//        session.persist(s1);


//        Fetch
//        Student s2 = session.get(Student.class, 102);
//        session.get(Student.class,s2);
//        session.load(Student.class,102);

//        Update
//    Student s2=new Student();
//    s2.setsName("Rahul");
//    s2.setsAge(53);
//    s2.setRollNo(102);
//    session.merge(s2);


//        Delete
//        Student s2= session.get(Student.class,103);
//        session.remove(s2);

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.telusko.Alien.class);
//        cfg.addAnnotatedClass(com.telusko.Laptop.class);
//        cfg.configure();
//
//        SessionFactory sf = cfg.buildSessionFactory();
        SessionFactory sf=new Configuration()
                .configure()
                .addAnnotatedClass(com.telusko.Alien.class)
                .addAnnotatedClass(com.telusko.Laptop.class)
                .buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        Laptop l1=new Laptop();
        l1.setLId(1);
        l1.setBrand("Asus");
        l1.setModel("TUF");
        l1.setRam("16Gb");

        Laptop l2=new Laptop();
        l2.setLId(2);
        l2.setBrand("Asus");
        l2.setModel("ROG");
        l2.setRam("16Gb");

        Laptop l3=new Laptop();
        l3.setLId(3);
        l3.setBrand("Apple");
        l3.setModel("Macbook Air");
        l3.setRam("16Gb");

        Alien a1=new Alien();
        a1.setAid(1);
        a1.setAname("Mike");
        a1.setTech("Java");

        Alien a2=new Alien();
        a2.setAid(3);
        a2.setAname("Ram");
        a2.setTech("Python");




        a1.setLaptop(Arrays.asList(l1,l2));
        a2.setLaptop(Arrays.asList(l3));



        session.persist(l1);
        session.persist(l2);
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);



        transaction.commit();
        session.close();

        Session session1=sf.openSession();
        Alien a5=session1.get(Alien.class,1);
        System.out.println(a5);
        session1.close();
        sf.close();
    }
}
