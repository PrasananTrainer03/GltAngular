import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-demo',
  templateUrl: './event-demo.component.html',
  styleUrls: ['./event-demo.component.css']
})
export class EventDemoComponent implements OnInit {

  greet() {
    alert("Welcome to Angular Good Morning...");
  }

  topic() {
    alert("Angular 8 Components going on...")
  }

  company() {
    alert("Grey Line Technologies...");
  }
  constructor() { }

  ngOnInit(): void {
  }

}
