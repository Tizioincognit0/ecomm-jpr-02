import { AnagraficheCrudComponent } from './anagrafiche-crud/anagrafiche-crud.component';
import { AssociaImballoComponent } from './associazioni/associa-imballo/associa-imballo.component';
import { AssociaColoreComponent } from './associazioni/associa-colore/associa-colore.component';
import { TagliaCrudComponent } from './taglia-crud/taglia-crud.component';
import { SpedizioneCRUDComponent } from './spedizione-crud/spedizione-crud.component';
import { HomeCRUDComponent } from './home-crud/home-crud.component';
import { ImballoCrudComponent } from './imballo-crud/imballo-crud.component';
import { CategoriaCRUDComponent } from './categoria-crud/categoria-crud.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ColoreCrudComponent } from './colore-crud/colore-crud.component';
import { ProdottoCrudComponent } from './prodotto-crud/prodotto-crud.component';
import { OffertaCrudComponent } from './offerta-crud/offerta-crud.component';
import { AssociaCategoriaComponent } from './associazioni/associa-categoria/associa-categoria.component';
import { AssociaTagliaComponent } from './associazioni/associa-taglia/associa-taglia.component';
import { AssociaOffertaComponent } from './associazioni/associa-offerta/associa-offerta.component';
import { AssociaSpedizioneComponent } from './associazioni/associa-spedizione/associa-spedizione.component';


const routes: Routes = [
  { path: 'home-crud', component: HomeCRUDComponent},
  { path: 'anagrafiche-crud', component: AnagraficheCrudComponent},
  { path: 'imballo-crud', component: ImballoCrudComponent},
  { path: 'categoria-crud', component: CategoriaCRUDComponent },
  { path: 'colore-crud', component: ColoreCrudComponent},
  { path: 'prodotto-crud', component: ProdottoCrudComponent},
  { path: 'spedizione-crud', component: SpedizioneCRUDComponent},
  { path: 'taglia-crud', component: TagliaCrudComponent},
  { path: 'offerta-crud', component: OffertaCrudComponent},
  { path: 'associa-colore', component: AssociaColoreComponent},
  { path: 'associa-imballo', component: AssociaImballoComponent},
  { path: 'associa-categoria', component: AssociaCategoriaComponent},
  { path: 'associa-taglia', component: AssociaTagliaComponent},
  { path: 'associa-offerta', component: AssociaOffertaComponent},
  { path: 'associa-imballo', component: AssociaImballoComponent},
  { path: 'associa-spedizione', component: AssociaSpedizioneComponent},
  { path: '', redirectTo: '/home-crud', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
