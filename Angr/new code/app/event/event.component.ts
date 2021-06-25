import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css']
})
export class EventComponent implements OnInit {

  company() {
    alert("GreyLine Technologies...")
  }
  show() {
    alert("Welcome to Angular Component...")
  }
  constructor() { }

  ngOnInit(): void {
  }

}
