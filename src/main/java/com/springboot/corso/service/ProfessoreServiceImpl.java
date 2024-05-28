package com.springboot.corso.service;

import com.springboot.corso.dao.interfaces.ProfessoreDAO;
import com.springboot.corso.entity.Professore;
import com.springboot.corso.service.interfaces.ProfessoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProfessoreServiceImpl implements ProfessoreService {

    private ProfessoreDAO professoreDAO;

    @Autowired
    public ProfessoreServiceImpl(ProfessoreDAO professoreDAO){
        this.professoreDAO = professoreDAO;
    }

    @Override
    public List<Professore> getAll() {
        return professoreDAO.getAll();
    }

    @Override
    public Professore getById(Integer idProfessore) {
        return professoreDAO.getById(idProfessore);
    }

    @Override
    @Transactional
    public Professore save(Professore professore) {
        return professoreDAO.save(professore);
    }

    @Override
    public void delete(Integer idProfessore) {
        professoreDAO.delete(idProfessore);
    }
}
