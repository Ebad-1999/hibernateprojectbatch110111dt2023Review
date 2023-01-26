package bi_onetoone;

import javax.persistence.*;

@Entity

@Table(name= "t_student03")
public class Student03 {

    @Id
    private int id;

    @Column(name = "std_name", length = 100, nullable = false, unique = false)
    private String name;
    private int grade;

    @OneToOne(mappedBy = "student");
    private Diray diray;


    }
}
