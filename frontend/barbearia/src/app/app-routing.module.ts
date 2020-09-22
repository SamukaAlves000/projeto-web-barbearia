import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from "./views/home/home.component";
import {ServiceCrudComponent} from "./views/service-crud/service-crud.component";
import {ServiceCreateComponent} from "./components/service/service-create/service-create.component";

const routes: Routes = [
  {
    path:"",
    component: HomeComponent
  },
  {
    path:"services",
    component: ServiceCrudComponent
  },
  {
    path:"services/create",
    component: ServiceCreateComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
