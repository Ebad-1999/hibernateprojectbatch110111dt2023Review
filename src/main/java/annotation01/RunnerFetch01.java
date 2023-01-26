package annotation01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.management.Query;
import java.util.Arrays;
import java.util.List;

public class RunnerFetch01 {

    public static void main(String[] args) {


        Configuration con = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Student01.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();


//        Student01 student1 = session.get(Student01.class, 1001);
//        Student01 student2 = session.get(Student01.class, 1002);
//        Student01 student3 = session.get(Student01.class, 1003);
//
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//
//        tx.commit();
//        session.close();
//        sf.close();

//        System.out.println("****************Second way using sql*********");
//        String sqlQuery = "SELECT * FROM t_student01";
//        List<Object[]> resultList =session.createQuery(sqlQuery).getResultList();
//
//        for (Object[] o: resultList){
//            System.out.println(Arrays.toString(o));
//        }

//        System.out.println("****************Second way using hql*********");
//        String hqlQuery = "FROM Student01";
//        List<Student01> resultList = session.createQuery(hqlQuery, Student01.class).getResultList();
//        for (Student01 s:resultList){
//            System.out.println(s);
//        }

//        System.out.println("****************Second way using sql*********");

//        String slqQuery2 = "SELECT * FROM t_student01 WHERE std_name= 'WWW' ";
//        Object[] resultList = (Object[]) session.createQuery(slqQuery2).uniqueResult();
//        System.out.println(slqQuery2);

//        System.out.println("****************Second way using sql*********");
//
//        String hlqQuery3 = " FROM Student01 WHERE name= 'WWW' ";
//        Student01 std =  session.createQuery(hlqQuery3, Student01.class).uniqueResult();
//        System.out.println(std);

        String hqlQuery4 = "FROM s.id, s.name,FROM Student01 s WHERE s.id <1002";
        List<Student01> std2 = session.createQuery(hqlQuery4, Student01.class).getResultList();

        for (Student01 std: std2){
            System.out.println(std2);
        }













    }
}
