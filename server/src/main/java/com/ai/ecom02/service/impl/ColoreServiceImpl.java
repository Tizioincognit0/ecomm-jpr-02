package com.ai.ecom02.service.impl;

import com.ai.ecom02.model.Colore;
import com.ai.ecom02.repository.RepColore;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ai.ecom02.service.ColoreService;

@Service
public class ColoreServiceImpl implements ColoreService {

    @Autowired
    RepColore repColore;

    @Override
    public Colore add(Colore o) {
        return repColore.save(o);
    }

    @Override
    public void delete(Colore o) {
        repColore.delete(o);
    }

    @Override
    public Colore update(Colore o) {
        return repColore.save(o);
    }

    @Override
    public List<Colore> getAll() {
        return repColore.findAll();
    }

    @Override
    public Colore findByColore(Colore colore) {
        return repColore.findByColore(colore.getColore());
    }

    @Override
    public Colore findById(Colore colore) {
        Colore c = repColore.getOne(colore.getId());
        //Optional<Colore> s = repColore.findById(colore.getId());
        //Colore c = s.get();
        return c;

    }

    @Override
    public List<Colore> findByColoreLike(Colore colore) {
        return repColore.findByColoreLike("%"+colore.getColore()+"%");
    }
    
}
