package com.springboot.corso.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "studente")
@NoArgsConstructor
@Getter
@Setter
public class Studente {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private @Id Integer id;

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

}
