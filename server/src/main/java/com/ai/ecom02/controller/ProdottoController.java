package com.ai.ecom02.controller;

import com.ai.ecom02.dto.ListaProdottoDto;
import com.ai.ecom02.dto.ProdottoDto;
import com.ai.ecom02.dto.RicercaDto;
import com.ai.ecom02.model.Prodotto;
import com.ai.ecom02.model.Token;
import com.ai.ecom02.service.SecurityService;
import com.ai.ecom02.service.impl.ProdottoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ProdottoController {

    @Autowired
    ProdottoServiceImpl srvProdotto;

    @Autowired
    SecurityService securityService;

    @RequestMapping(value = ("/lista-prodotti"))
    @ResponseBody
    public ListaProdottoDto listaProdotti(
            @RequestBody ProdottoDto prodottoDto
    ) {
        Token t = prodottoDto.getToken();
        t = securityService.retrieveToken(t);
        List<Prodotto> lista = srvProdotto.getAll();
        ListaProdottoDto listaProdottoDto = new ListaProdottoDto(lista, t);
        return listaProdottoDto;
    }

    @RequestMapping(value = ("/prodotti-add"))
    @ResponseBody
    public void addProdotto(
            @RequestBody ProdottoDto prodottoDto
    ) {
        Token t = prodottoDto.getToken();
        t = securityService.retrieveToken(t);
        srvProdotto.add(prodottoDto.getProdotto());
    }

    @RequestMapping(value = ("/prodotti-delete"))
    @ResponseBody
    public void deleteProdotto(
            @RequestBody ProdottoDto prodottoDto
    ) {
        Token t = prodottoDto.getToken();
        t = securityService.retrieveToken(t);
        srvProdotto.delete(prodottoDto.getProdotto());
    }

    @RequestMapping(value = ("/prodotti-update"))
    @ResponseBody
    public void updateProdotto(
            @RequestBody ProdottoDto prodottoDto
    ) {
        Token t = prodottoDto.getToken();
        t = securityService.retrieveToken(t);
        srvProdotto.update(prodottoDto.getProdotto());
    }

    @RequestMapping(value = ("/prodotti-find"))
    @ResponseBody
    public ListaProdottoDto findProdottiByCodiceOrDescrizione(
            @RequestBody RicercaDto ricercaDto
    ) {
        Token t = ricercaDto.getToken();
        t = securityService.retrieveToken(t);
        List<Prodotto> lista = srvProdotto.findByDescrizioneOrCodiceLike(ricercaDto);
        ListaProdottoDto listaProdottoDto = new ListaProdottoDto(lista, t);
        return listaProdottoDto;
    }

}
