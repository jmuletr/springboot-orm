package com.esliceu.orm.domain;

import javax.persistence.*;

@Entity(name = "glosa")
public class Glosa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idglosa")
    private Integer id;
    @Column(name = "titol")
    private String titol;

    public Glosa() {
    }

    public Glosa(Integer id, String titol) {
        this.id = id;
        this.titol = titol;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
