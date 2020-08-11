package com.ai.ecom02.controller;

import com.ai.ecom02.model.Imballo;
import com.ai.ecom02.service.impl.ImballoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Francesco
 */

@CrossOrigin("*")
@RestController
public class ImballoController {

    @Autowired
    ImballoServiceImpl srvImballo;

    @RequestMapping(value = {"/list-imballo"})
    @ResponseBody
    public List<Imballo> listaImballi() {
        return srvImballo.getAll();
    }

    @RequestMapping(value = {"/add-imballo"})
    @ResponseBody
    public List<Imballo> aggiungiImballo(
            @RequestBody Imballo imballo
    ) {
        srvImballo.add(imballo);
        return srvImballo.getAll();
    }

    @RequestMapping(value = {"/delete-imballo/{id}"})
    @ResponseBody
    public Imballo cancellaImballo(
            @PathVariable Long id
    ) {
        Imballo imballo = new Imballo(id);
        srvImballo.delete(imballo);
        return imballo;
    }

    @RequestMapping(value = {"/update-imballo"})
    @ResponseBody
    public Imballo aggiornaImballo(
            @RequestBody Imballo imballo
    ) {
        srvImballo.update(imballo);
        return imballo;
    }

    @RequestMapping(value = {"/find-imballo"})
    @ResponseBody
    public Imballo ricercaImballo(
            @RequestBody Imballo imballo
    ) {
        srvImballo.findById(imballo);
        return imballo;
    }

//    @RequestMapping(value = {"/find-by-descrizione-imballo"})
//    @ResponseBody
//    public List<Imballo> ricercaByDescrizioneImballo(
//            @RequestBody Imballo imballo
//    ) {
//        return srvImballo.findByDescrizione(imballo);         
//    }
    
    
    @RequestMapping(value = {"/find-by-descrizione-imballo"})
    @ResponseBody
    public List<Imballo> ricercaByDescrizioneImballo(
            @RequestBody String ricerca
    ) {
        return srvImballo.findByDescrizione(ricerca);         
    }
    

}
