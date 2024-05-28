package com.springboot.corso.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "professore")
public class Professore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @OneToMany(mappedBy = "professore")
    private List<Corso> listaCorsi;

    public Professore(String nome, String cognome, List<Corso> listaCorsi) {
        this.nome = nome;
        this.cognome = cognome;
        this.listaCorsi = listaCorsi;
    }

    public Professore() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public List<Corso> getListaCorsi() {
        return listaCorsi;
    }

    public void setListaCorsi(List<Corso> listaCorsi) {
        this.listaCorsi = listaCorsi;
    }
}
