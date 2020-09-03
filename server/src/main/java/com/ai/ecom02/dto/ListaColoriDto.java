/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ai.ecom02.dto;

import com.ai.ecom02.model.Colore;
import com.ai.ecom02.model.Token;
import java.util.List;

/**
 *
 * @author Gian Marco
 */
public class ListaColoriDto {
    List<Colore> listaColori;
    Token token;

    public ListaColoriDto() {
    }

    public ListaColoriDto(List<Colore> listaColori, Token token) {
        this.listaColori = listaColori;
        this.token = token;
    }

    public List<Colore> getListaColori() {
        return listaColori;
    }

    public void setListaColori(List<Colore> listaColori) {
        this.listaColori = listaColori;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }
    
    
}