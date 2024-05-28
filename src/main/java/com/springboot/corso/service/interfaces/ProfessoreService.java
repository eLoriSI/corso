package com.springboot.corso.service.interfaces;

import com.springboot.corso.entity.Professore;

import java.util.List;

public interface ProfessoreService {
    List<Professore> getAll();

    Professore getById(Integer idProfessore);

    Professore save(Professore professore);

    void delete(Integer idProfessore);
}
