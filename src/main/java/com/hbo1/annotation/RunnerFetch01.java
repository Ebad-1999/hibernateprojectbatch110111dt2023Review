package com.hbo1.annotation;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch01 {

    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Children01.class);

        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();




/*
        String sqlQuery = "Select * From t_children01";
        Children01 children01 = session.get(Children01.class,1000);
        System.out.println(children01);

        int stdId = 1001;
        Children01 children011 = session.get(Children01.class, stdId);
        System.out.println(children011);

 */



    }


}
