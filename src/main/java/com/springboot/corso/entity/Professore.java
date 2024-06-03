package com.springboot.corso.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "professore")
@NoArgsConstructor
@Getter
@Setter
public class Professore {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private @Id Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @OneToMany(mappedBy = "professore")
    @JsonBackReference
    private List<Corso> listaCorsi;

    public Professore(String nome, String cognome, List<Corso> listaCorsi) {
        this.nome = nome;
        this.cognome = cognome;
        this.listaCorsi = listaCorsi;
    }
}
