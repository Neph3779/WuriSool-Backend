package com.neph.WuriSool.data;

import com.neph.WuriSool.domain.Liquor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class LiquorRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Long save(Liquor liquor) {
        em.persist(liquor);
        return liquor.getId();
    }

    @Transactional
    public Liquor find(Long id) {
        return em.find(Liquor.class, id);
    }
}
