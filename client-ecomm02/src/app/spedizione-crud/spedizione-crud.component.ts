import { Component, OnInit } from '@angular/core';
import { SpedizioneServiceService } from 'src/app/service/spedizione-service.service';
import { Spedizione } from '../model/spedizione';

@Component({
  selector: 'app-spedizione-crud',
  templateUrl: './spedizione-crud.component.html',
  styleUrls: ['./spedizione-crud.component.css']
})
export class SpedizioneCRUDComponent implements OnInit {

  aggiungiState = false;
  modificaState = false;
  visualizzaState = false;
  msgSpedizioneNulla = false;

  indice: number;
  disabilitaCampi = false;
  nascondiButton = false;
  searchState = true;
  tabellaState = true;


  constructor(public meme: SpedizioneServiceService) { } //da creare

  ngOnInit() {
    this.meme.spedizioni = this.meme.lista();
  }
  searchCriteria() {
    if (this.meme.ricerca.ricerca != "") {
      this.meme.cerca();
    } else {
      return this.meme.lista();
    }
  }
  conferma() {
    console.log("siamo in conferma")
    if (this.aggiungiState) {
      if (this.meme.temp.codice != null) {
        console.log("spedizione con campi valorizzati");
        this.meme.addSpedizione();
        this.meme.temp = new Spedizione();
        this.aggiungiState = false;
      } else {
        console.log("descrizione null");
        this.msgSpedizioneNulla = false;
      }
    } else if (this.modificaState) {
      if (this.meme.temp.codice != "") {
        console.log("spedizione non vuota");
        this.meme.spedizioni[this.indice] = this.meme.temp;
        this.meme.update(this.meme.temp);
        this.tabellaState = true;
        this.searchState = true;
        this.modificaState = false;
        this.meme.temp = new Spedizione();
      } else {
        console.log("spedizione vuota");
        this.msgSpedizioneNulla = false;
      }
    } else {
      this.msgSpedizioneNulla = false;
    }
  }
  aggiungi() {
    this.aggiungiState = true;
    this.modificaState = false;
    this.meme.temp = new Spedizione();
    this.nascondiButton = false;
    this.disabilitaCampi = false;
    this.msgSpedizioneNulla = true;
  }
  annulla() {
    this.aggiungiState = false;
    this.modificaState = false;
    this.visualizzaState = false;
    this.msgSpedizioneNulla = false;
    this.tabellaState = true;
    this.searchState = true;
  }
  modifica(x: Spedizione, i: number) {
    this.indice = i;
    this.meme.temp = Object.assign({}, x)
    this.modificaState = true;
    this.visualizzaState = false;
    this.aggiungiState = false;
    this.nascondiButton = false;
    this.disabilitaCampi = false;
    this.searchState = false;
    this.tabellaState = false;
    this.msgSpedizioneNulla = true;
  }
  rimuovi(x: Spedizione, i: number) {
    this.indice = i;
    if (confirm("Vuoi eliminare la spedizione " + x.codice + "?")) {
      this.meme.temp = Object.assign({}, x);
      this.meme.spedizioni[this.indice] = this.meme.temp;
      this.meme.remove(this.meme.temp);
      this.meme.lista();
      this.meme.temp = new Spedizione();
      this.aggiungiState = false;
      this.modificaState = false;
      this.visualizzaState = false;
      this.nascondiButton = false;
      this.disabilitaCampi = true;
      this.searchState = true;
      this.msgSpedizioneNulla = false;
      this.tabellaState = true;
    } else {
      this.aggiungiState = false;
      this.visualizzaState = false;
    }
  }
  visualizzaDettagliSped(x: Spedizione, i: number) {
    this.indice = i;
    this.meme.temp = Object.assign({}, x);
    this.visualizzaState = true;
    this.nascondiButton = true;
    this.disabilitaCampi = true;
    this.msgSpedizioneNulla = true;
    this.searchState = true;
  }

  disabilitaCod() {
    this.msgSpedizioneNulla = true;
  }

  paginaDopo() {
    this.meme.paginaCorrente++;
    this.searchCriteria();
  }

  paginaPrima() {
    this.meme.paginaCorrente--;
    this.searchCriteria();
  }

}
