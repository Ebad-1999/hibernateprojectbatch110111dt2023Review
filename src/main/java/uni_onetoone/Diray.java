package uni_onetoone;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student03 getStudent() {
        return student;
    }

    public void setStudent(Student03 student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Diray{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
