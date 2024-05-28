package com.springboot.corso.dao.interfaces;

import com.springboot.corso.entity.Studente;

import java.util.List;

public interface StudenteDAO {
    List<Studente> getAllStudenti();

    Studente getStudenteById(Integer idStudente);

    Studente save(Studente studente);

    void deleteById(Integer idStudente);
}
