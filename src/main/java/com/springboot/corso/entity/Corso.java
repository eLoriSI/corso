package com.springboot.corso.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "corso")
@NoArgsConstructor
@Getter
@Setter
public class Corso {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private @Id Integer id;

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
    private List<Studente> listaStudenti;

    public Corso(String titolo, Professore professore, List<Studente> listaStudenti) {
        this.titolo = titolo;
        this.professore = professore;
        this.listaStudenti = listaStudenti;
    }

}
