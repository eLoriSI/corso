package com.springboot.corso.service;

import com.springboot.corso.dao.interfaces.StudenteDAO;
import com.springboot.corso.entity.Studente;
import com.springboot.corso.service.interfaces.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudenteServiceImpl implements StudenteService {

    private StudenteDAO studenteDAO;

    @Autowired
    public StudenteServiceImpl(StudenteDAO studenteDAO){
        this.studenteDAO = studenteDAO;
    }

    @Override
    public List<Studente> getAllStudenti() {
        return studenteDAO.getAllStudenti();
    }

    @Override
    public Studente getStudenteById(Integer idStudente) {
        return studenteDAO.getStudenteById(idStudente);
    }

    @Override
    @Transactional
    public Studente save(Studente studente) {
        return studenteDAO.save(studente);
    }

    @Override
    @Transactional
    public void deleteById(Integer idStudente) {
        studenteDAO.deleteById(idStudente);
    }
}
