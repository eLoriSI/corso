package com.springboot.corso.dao;

import com.springboot.corso.dao.interfaces.CorsoDAO;
import com.springboot.corso.entity.Corso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CorsoDAOImpl implements CorsoDAO {

    private EntityManager entityManager;

    @Autowired
    public CorsoDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Corso> getAll() {
        TypedQuery<Corso> query = entityManager.createQuery("from Corso", Corso.class);

        return query.getResultList();
    }

    @Override
    public Corso getById(Integer idCorso) {
        TypedQuery<Corso> query = entityManager.createQuery("select c from Corso c JOIN FETCH c.listaStudenti where c.id = :data", Corso.class);

        query.setParameter("data", idCorso);

        return query.getSingleResult();
    }

    @Override
    public Corso save(Corso corso) {
        return entityManager.merge(corso);
    }

    @Override
    public void deleteById(Integer idCorso) {
        entityManager.remove(getById(idCorso));
    }
}
