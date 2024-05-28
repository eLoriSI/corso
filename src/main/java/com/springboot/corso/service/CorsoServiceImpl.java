package com.springboot.corso.service;

import com.springboot.corso.dao.interfaces.CorsoDAO;
import com.springboot.corso.entity.Corso;
import com.springboot.corso.service.interfaces.CorsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CorsoServiceImpl implements CorsoService {

    private CorsoDAO corsoDAO;

    @Autowired
    public CorsoServiceImpl(CorsoDAO corsoDAO){
        this.corsoDAO = corsoDAO;
    }

    @Override
    public List<Corso> getAll() {
        return corsoDAO.getAll();
    }

    @Override
    public Corso getById(int idCorso) {
        return corsoDAO.getById(idCorso);
    }

    @Override
    @Transactional
    public Corso save(Corso corso) {
        return corsoDAO.save(corso);
    }

    @Override
    @Transactional
    public void deleteById(int idCorso) {
        corsoDAO.deleteById(idCorso);
    }
}
