import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-servico-crud',
  templateUrl: './servico-crud.component.html',
  styleUrls: ['./servico-crud.component.css']
})
export class ServicoCrudComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  navigateToServicoCreate():void{
    this.router.navigate(['/servicos/create'])
  }


}
