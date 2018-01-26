package com.esliceu.orm.domain;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "glosa")
public class Glosa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idglosa")
    private Integer id;
    @Column(name = "titol")
    private String titol;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "glosa_idglosa")
    private Set<Vers> vers;

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

    public Set<Vers> getVers() {
        return vers;
    }

    public void setVers(Set<Vers> vers) {
        this.vers = vers;
    }
}
