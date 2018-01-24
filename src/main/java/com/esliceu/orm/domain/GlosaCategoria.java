package com.esliceu.orm.domain;

//@Entity(name = "glosa_has_categoria")
public class GlosaCategoria {
    //@Column(name = "glosa_idglosa")
    //@ManyToMany(mappedBy = "")
    private Glosa idGlosa;
    private Categoria idCategoria;

    private GlosaCategoria() {
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Glosa getIdGlosa() {
        return idGlosa;
    }

    public void setIdGlosa(Glosa idGlosa) {
        this.idGlosa = idGlosa;
    }
}
