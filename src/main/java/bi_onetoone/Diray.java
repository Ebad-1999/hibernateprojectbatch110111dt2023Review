package bi_onetoone;

import javax.persistence.*;

@Entity
@Table(name="t_diray")
public class Diray {
    @Id
    private int id;

    private String name;

    @OneToOne
    @JoinColumn(name="std_id")
    private Student03 student;



}
