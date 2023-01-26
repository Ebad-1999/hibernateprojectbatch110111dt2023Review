package uni_onetoone;

import embeddable.Student02;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave03 {
    public static void main(String[] args) {
        Student03 student1 = new Student03();
        student1.setId(100);
        student1.setName("AAA");
        student1.setGrade(98);

        Student03 student2 = new Student03();
        student2.setId(101);
        student2.setName("BBBB");
        student2.setGrade(95);

        Student03 student3 = new Student03();
        student3.setId(102);
        student3.setName("CCC");
        student3.setGrade(90);

        Diray diray = new Diray();
        diray.setId(10);
        diray.setName("Homework1");
        diray.setStudent(student1);

        Diray diray1 = new Diray();
        diray.setId(11);
        diray.setName("Homework2");
        diray.setStudent(student2);

        Diray diray2 = new Diray();
        diray.setId(12);
        diray.setName("Homework3");
        diray.setStudent(student3);

        Configuration con = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Student03.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(student1);
        session.save(student2);
        session.save(student3);

        session.save(diray);
        session.save(diray1);
        session.save(diray2);

        tx.commit();
        session.close();
        sf.close();
    }
}

