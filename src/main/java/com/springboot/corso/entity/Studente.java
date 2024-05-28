package com.springboot.corso.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "studente")
public class Studente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "email")
    private String email;

    @ManyToMany(mappedBy = "listaStudenti")
    @JsonBackReference
    private List<Corso> listaCorsi;

    public Studente(String nome, String cognome, String email, List<Corso> listaCorsi) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.listaCorsi = listaCorsi;
    }

    public Studente() {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Corso> getListaCorsi() {
        return listaCorsi;
    }

    public void setListaCorsi(List<Corso> listaCorsi) {
        this.listaCorsi = listaCorsi;
    }
}
