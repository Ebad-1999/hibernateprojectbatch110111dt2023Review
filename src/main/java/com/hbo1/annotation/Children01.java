package com.hbo1.annotation;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_children")
public class Children01 {

    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String f_name;

    @Column
    private int grade;

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

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Children01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", f_name='" + f_name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
