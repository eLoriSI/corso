package com.springboot.corso.dao.interfaces;

import com.springboot.corso.entity.Professore;

import java.util.List;

public interface ProfessoreDAO {
    List<Professore> getAll();

    Professore getById(Integer idProfessore);

    Professore save(Professore professore);

    void delete(Integer idProfessore);
}
