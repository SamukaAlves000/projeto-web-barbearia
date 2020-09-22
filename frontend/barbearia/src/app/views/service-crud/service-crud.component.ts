import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-service-crud',
  templateUrl: './service-crud.component.html',
  styleUrls: ['./service-crud.component.css']
})
export class ServiceCrudComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }
    navigateToServiceCreate():void{
     this.router.navigate(['/services/create'])
    }
}
