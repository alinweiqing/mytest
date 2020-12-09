package com.lwq.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String name;
    //多个用户对应一个角色(多对一)
    @ManyToOne
    @JoinColumn(name = "resos_id")
    private  Resos resos;


    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Resos getResos() {
        return resos;
    }

    public void setResos(Resos resos) {
        this.resos = resos;
    }
}
