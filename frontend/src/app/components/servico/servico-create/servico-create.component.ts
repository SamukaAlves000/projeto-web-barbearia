import { ServicoService } from './../servico.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-servico-create',
  templateUrl: './servico-create.component.html',
  styleUrls: ['./servico-create.component.css']
})
export class ServicoCreateComponent implements OnInit {

  constructor(private servicoService:ServicoService,private router:Router) { }

  ngOnInit(): void {
  }

  createServico():void{
    this.servicoService.showMessage("Operação realizada com sucesso!")
  }

  cancel():void{
    this.router.navigate(['/servicos'])
  }

}
