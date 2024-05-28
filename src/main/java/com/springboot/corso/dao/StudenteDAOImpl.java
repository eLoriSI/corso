package com.springboot.corso.dao;

import com.springboot.corso.dao.interfaces.StudenteDAO;
import com.springboot.corso.entity.Studente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudenteDAOImpl implements StudenteDAO {

    private EntityManager entityManager;

    @Autowired
    public StudenteDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Studente> getAllStudenti() {
        TypedQuery<Studente> query = entityManager.createQuery("from Studente", Studente.class);

        return query.getResultList();
    }

    @Override
    public Studente getStudenteById(Integer idStudente) {
        return entityManager.find(Studente.class, idStudente);
    }

    @Override
    public Studente save(Studente studente) {
        return entityManager.merge(studente);
    }

    @Override
    public void deleteById(Integer idStudente) {
        entityManager.remove(getStudenteById(idStudente));
    }
}
