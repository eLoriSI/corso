package com.springboot.corso.service.interfaces;

import com.springboot.corso.entity.Studente;

import java.util.List;

public interface StudenteService {
    List<Studente> getAllStudenti();

    Studente getStudenteById(Integer idStudente);

    Studente save(Studente studente);

    void deleteById(Integer idStudente);
}
