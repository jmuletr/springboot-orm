package com.esliceu.orm.domain;

import javax.persistence.*;

@Entity(name = "vers")
public class Vers {
    @Id
    @Column(name = "idvers")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idVers;
    @Column(name = "vers")
    private String vers;
    @Column(name = "ordre")
    private short ordre;
    @Column(name = "glosa_idglosa", insertable = false, updatable = false)
    private Integer glosaId;

    private Vers() {
    }

    public Integer getIdVers() {
        return idVers;
    }

    public void setIdVers(Integer idVers) {
        this.idVers = idVers;
    }

    public String getVers() {
        return vers;
    }

    public void setVers(String vers) {
        this.vers = vers;
    }

    public short getOrdre() {
        return ordre;
    }

    public void setOrdre(short ordre) {
        this.ordre = ordre;
    }

    public Integer getGlosaId() {
        return glosaId;
    }

    public void setGlosaId(Integer glosaId) {
        this.glosaId = glosaId;
    }
}
