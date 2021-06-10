import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-condition-ex',
  templateUrl: './condition-ex.component.html',
  styleUrls: ['./condition-ex.component.css']
})
export class ConditionExComponent implements OnInit {

  flag : boolean;
  constructor() {
    this.flag=true;
   }

  ngOnInit(): void {
  }

}
