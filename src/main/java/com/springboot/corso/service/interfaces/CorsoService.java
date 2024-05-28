package com.springboot.corso.service.interfaces;

import com.springboot.corso.entity.Corso;

import java.util.List;

public interface CorsoService {
    List<Corso> getAll();

    Corso getById(int idCorso);

    Corso save(Corso corso);

    void deleteById(int idCorso);
}
