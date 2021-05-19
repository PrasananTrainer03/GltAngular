import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-name-demo',
  templateUrl: './name-demo.component.html',
  styleUrls: ['./name-demo.component.css']
})
export class NameDemoComponent implements OnInit {

  firstName : string;
  lastName : string;
  fullName : string;

  show() {
    this.fullName = this.firstName + " " +this.lastName;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
