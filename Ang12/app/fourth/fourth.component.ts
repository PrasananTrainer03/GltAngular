import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fourth',
  templateUrl: './fourth.component.html',
  styleUrls: ['./fourth.component.css']
})
export class FourthComponent implements OnInit {

  trainer : string;
  company : string;
  city : string;
  constructor() {
    this.trainer="Prasanna";
    this.company="GLT";
    this.city="Hyderabad";
   }

  ngOnInit(): void {
  }

}
