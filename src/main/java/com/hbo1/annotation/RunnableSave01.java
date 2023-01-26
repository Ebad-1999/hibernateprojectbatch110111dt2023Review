package com.hbo1.annotation;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnableSave01 {

    public static void main(String[] args) {

        Children01 children01 = new Children01();
        children01.setId(1000);
        children01.setName("Ahmad");
        children01.setF_name("Salim");
        children01.setGrade(66);

        Children01 children02 = new Children01();
        children02.setId(1001);
        children02.setName("Shrief");
        children02.setF_name("Mhmood");
        children02.setGrade(99);

        Children01 children03 = new Children01();
        children03.setId(1002);
        children03.setName("Jawid");
        children03.setF_name("Ali");
        children03.setGrade(78);

        Children01 children04 = new Children01();
        children04.setId(1003);
        children04.setName("hamed");
        children04.setF_name("Khan");
        children04.setGrade(88);

        Configuration con = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Children01.class);

        SessionFactory sf = con.buildSessionFactory();


        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(children01);
        session.save(children02);
        session.save(children03);
        session.save(children04);


        tx.commit();
        session.close();
        sf.close();


    }
}
