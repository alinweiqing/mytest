package com.lwq.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_Grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String  Gradename;
    //一对一
    //mappedBy:维护外键关联关系，其中mappedby="grade",关系则学生实体类中的grade维护

    @OneToOne(mappedBy = "grade")
    private Student student;

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", Gradename='" + Gradename + '\'' +
                '}';
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradename() {
        return Gradename;
    }

    public void setGradename(String gradename) {
        Gradename = gradename;
    }

    public Grade() {
    }

    public Grade(String gradename) {
        Gradename = gradename;
    }


}
