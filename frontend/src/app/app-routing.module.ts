import { ServicosCrudComponent } from './views/servicos-crud/servicos-crud.component';
import { HomeComponent } from './views/home/home.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [{
  path: "",
  component: HomeComponent

},
{
  path: "servicos",
  component: ServicosCrudComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
