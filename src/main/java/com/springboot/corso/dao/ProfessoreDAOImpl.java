package com.springboot.corso.dao;

import com.springboot.corso.dao.interfaces.ProfessoreDAO;
import com.springboot.corso.entity.Professore;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfessoreDAOImpl implements ProfessoreDAO {

    private EntityManager entityManager;

    @Autowired
    public ProfessoreDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Professore> getAll() {
        TypedQuery<Professore> query = entityManager.createQuery("from Professore", Professore.class);

        return query.getResultList();
    }

    @Override
    public Professore getById(Integer idProfessore) {
        return entityManager.find(Professore.class, idProfessore);
    }

    @Override
    public Professore save(Professore professore) {
        return entityManager.merge(professore);
    }

    @Override
    public void delete(Integer idProfessore) {
        entityManager.remove(getById(idProfessore));
    }
}
