import { Injectable } from '@angular/core';
import  {MatSnackBar} from "@angular/material/snack-bar";
import {HttpClient} from "@angular/common/http";
import {Service} from "./service.model";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  baseUrl = "http://localhost:3001/servicos"
  constructor(private snackBar: MatSnackBar,private  http: HttpClient) { }

  showMessage(msg:string): void {
    this.snackBar.open(msg,'X',{
      duration:3000,
      horizontalPosition:"right",
      verticalPosition:"top"
    })
  }

  create(service:Service):Observable<Service>{
    return this.http.post<Service>(this.baseUrl,service)
  }

  read(): Observable<Service[]>{
    return this.http.get<Service[]>(this.baseUrl)
  }

}
