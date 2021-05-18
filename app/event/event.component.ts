import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css']
})
export class EventComponent implements OnInit {

  sayHello() {
    alert("Welcome to Angular...")
  }

  company() {
    alert("Company is GreyLine technologies...")
  }
  topic() {
    alert("Hi Angular 8 topic is going on...")
  }
  constructor() { }

  ngOnInit(): void {
  }

}
