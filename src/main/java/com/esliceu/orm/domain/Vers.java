package com.esliceu.orm.domain;

import javax.persistence.*;

@Entity(name = "vers")
public class Vers {
    @Id
    @Column(name = "idvers")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVers;
    @Column(name = "vers")
    private String vers;
    @Column(name = "ordre")
    private short ordre;

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
}
