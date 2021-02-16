import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  

empname='';
empage='';
emproles='';
  employees:any = [];



  

  constructor() { }

  ngOnInit(): void {
  }
  addEmployee() {
    
    let empref:any = {
      name: this.empname,
      age: this.empage,
      roles: this.emproles,
      id: this.employees.length + 1,
    };
    
     this.employees.push(empref);

  }
}

