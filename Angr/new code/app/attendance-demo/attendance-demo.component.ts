import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-attendance-demo',
  templateUrl: './attendance-demo.component.html',
  styleUrls: ['./attendance-demo.component.css']
})
export class AttendanceDemoComponent implements OnInit {

  chkAjay : boolean;
  chkManikanta : boolean;

  result : string;

  attendance() {
    this.result="";
    if (this.chkAjay==true) {
      this.result+="Ajay is Present Today...\r\n";
    } else {
      this.result+="Ajay is Absent Today...\r\n";
    }

    if (this.chkManikanta==true) {
      this.result+="Manikanta is Present today...\r\n";
    } else {
      this.result+="Manikanta is Absent Today...\r\n";
    }
  }
  constructor() {
    this.chkAjay=false;
    this.chkManikanta=false;
   }

  ngOnInit(): void {
  }

}
