import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-anagrafiche-crud',
  templateUrl: './anagrafiche-crud.component.html',
  styleUrls: ['./anagrafiche-crud.component.css']
})
export class AnagraficheCrudComponent {
  
  constructor(private router:Router){}

  categoria(){
    this.router.navigateByUrl('/categoria-crud')
  }

  colore(){
    this.router.navigateByUrl('/colore-crud')
  }

  imballo(){
    this.router.navigateByUrl('/imballo-crud')
  }

  offerta(){
    this.router.navigateByUrl('/offerta-crud')
  }

  prodotto(){
    this.router.navigateByUrl('/prodotto-crud')
  }

  spedizione(){
    this.router.navigateByUrl('/spedizione-crud')
  }

  taglia(){
    this.router.navigateByUrl('/taglia-crud')
  }

}
