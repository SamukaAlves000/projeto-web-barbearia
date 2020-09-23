import { Component, OnInit } from '@angular/core';
import {ServiceService} from "../service.service";
import {Router} from "@angular/router";
import {Service} from "../service.model";

@Component({
  selector: 'app-service-create',
  templateUrl: './service-create.component.html',
  styleUrls: ['./service-create.component.css']
})
export class ServiceCreateComponent implements OnInit {

  constructor(private serviceService: ServiceService,private router:Router) { }

  service: Service = {
    descricao: '',
    valor: null,
    duracao: null
  }
  ngOnInit(): void {
  }

  createService():void {
    this.serviceService.create(this.service).subscribe(() =>{
      this.serviceService.showMessage("Operação realizada com sucesso!")
      this.cancel()
    })

  }

  cancel():void{
    this.router.navigate(['/services'])
  }
}
