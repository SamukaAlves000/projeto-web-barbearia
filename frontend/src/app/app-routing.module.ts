import { ServicoCreateComponent } from './components/servico/servico-create/servico-create.component';

import { HomeComponent } from './views/home/home.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ServicoCrudComponent } from './views/servico-crud/servico-crud.component';


const routes: Routes = [{
  path: "",
  component: HomeComponent

},
{
  path: "servicos",
  component: ServicoCrudComponent
},
{
  path: "servicos/create",
  component: ServicoCreateComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
