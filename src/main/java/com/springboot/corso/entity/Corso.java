package com.springboot.corso.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "corso")
public class Corso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "titolo")
    private String titolo;

    @ManyToOne
    @JoinColumn(name = "professore_id")
    private Professore professore;

    @ManyToMany
    @JoinTable(
            name = "corso_studente",
            joinColumns = @JoinColumn(name = "corso_id"),
            inverseJoinColumns = @JoinColumn(name = "studente_id")
    )
    @JsonManagedReference
    private List<Studente> listaStudenti;

    public Corso(String titolo, Professore professore, List<Studente> listaStudenti) {
        this.titolo = titolo;
        this.professore = professore;
        this.listaStudenti = listaStudenti;
    }

    public Corso() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Professore getProfessore() {
        return professore;
    }

    public void setProfessore(Professore professore) {
        this.professore = professore;
    }

    public List<Studente> getListaStudenti() {
        return listaStudenti;
    }

    public void setListaStudenti(List<Studente> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }


}
