package com.springboot.corso.dao.interfaces;

import com.springboot.corso.entity.Corso;

import java.util.List;

public interface CorsoDAO {

    Corso getById(Integer idCorso);

    List<Corso> getAll();

    Corso save(Corso corso);

    void deleteById(Integer idCorso);
}
