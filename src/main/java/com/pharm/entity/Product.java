package com.pharm.entity;

import javax.persistence.*;

@Entity
@Table(name = "Lieky")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "kategoria")
    private String kategoria;
    @Column(name = "nazov")
    private String nazov;
    @Column(name = "expiracia")
    private String expiracia;
    @Column(name = "skladKs")
    private int skladKs;
    @Column(name = "cena")
    private float cena;

    public Product() {
    }

    public Product(Integer id, String kategoria, String nazov, String expiracia, int skladKs, float cena) {
        this.id = id;
        this.kategoria = kategoria;
        this.nazov = nazov;
        this.expiracia = expiracia;
        this.skladKs = skladKs;
        this.cena = cena;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getExpiracia() {
        return expiracia;
    }

    public void setExpiracia(String expiracia) {
        this.expiracia = expiracia;
    }

    public int getSkladKs() {
        return skladKs;
    }

    public void setSkladKs(int skladKs) {
        this.skladKs = skladKs;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }
}
