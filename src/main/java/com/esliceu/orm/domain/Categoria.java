package com.esliceu.orm.domain;

import javax.persistence.*;

@Entity(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idcategoria")
    private Integer idCategoria;
    @Column(name = "nom")
    private String nom;

    private Categoria() {
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
