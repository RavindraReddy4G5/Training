import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {

  Eno:number;
  Ename:string;
  BSalary:number;
  Da:number;
  Hra:number;
  Tsal:number;
  public Display(){
    this.Da=(10/100)*this.BSalary;
    this.Hra=(8/100)*this.BSalary;
    this.Tsal=this.BSalary+this.Da+this.Hra;
  }
}

