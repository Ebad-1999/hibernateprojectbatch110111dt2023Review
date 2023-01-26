package embeddable;

import annotation01.Student01;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnableSave02 {

    public static void main(String[] args) {

        Student02 student1 = new Student02();
        student1.setId(1001);
        student1.setName("Ali");
        student1.setGrade(100);

        Address address1 = new Address();
        address1.setCity("ankara");
        address1.setStreet("Apple street");
        address1.setCountry("Turkish");
        address1.setZipCode("123145");
        student1.setAddress(address1);

        Student02 student2 = new Student02();
        student2.setId(1002);
        student2.setName("Ahmad");
        student2.setGrade(101);

        Address address2 = new Address();
        address2.setCity("Lasvogus");
        address2.setStreet("Orange street");
        address2.setCountry("USA");
        address2.setZipCode("12222145");
        student1.setAddress(address2);


        Configuration con = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Student02.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(student1);
        session.save(student2);




        tx.commit();
        session.close();
        sf.close();
    }
}
