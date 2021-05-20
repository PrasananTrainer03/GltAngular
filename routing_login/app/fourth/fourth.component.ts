import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fourth',
  templateUrl: './fourth.component.html',
  styleUrls: ['./fourth.component.css']
})
export class FourthComponent implements OnInit {

  topic : string;
  company : string;
  constructor() {
    this.topic="Angular 8";
    this.company="GreyLine Technologies...";
   }

  ngOnInit(): void {
  }

}
