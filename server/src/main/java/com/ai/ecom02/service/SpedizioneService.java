/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ai.ecom02.service;

import com.ai.ecom02.model.Spedizione;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roberto
 */
@Service
public interface SpedizioneService {

    void addSped(Spedizione spedizione);
    
    List<Spedizione> getLista();

    Page<Spedizione> getLista(Pageable p);

    List<Spedizione> removeSped(Long id);
    
    List<Spedizione> findSped(String stringa);

    Page<Spedizione> findSped(String ricerca, Pageable p);

    List<Spedizione> updateSped(Spedizione spedizione);
}
