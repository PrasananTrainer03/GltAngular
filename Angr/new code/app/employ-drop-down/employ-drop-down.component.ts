import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-drop-down',
  templateUrl: './employ-drop-down.component.html',
  styleUrls: ['./employ-drop-down.component.css']
})
export class EmployDropDownComponent implements OnInit {

  sname : string;
  employs = [
    new Employ(1,"Ajay","Java","Programmer",82345),
    new Employ(3,"Mutyala Raju","UI","Developer",81344),
    new Employ(4,"Sulthana","Angular","Programmer",92224),
    new Employ(5,"Vishnu","Angular","Programmer",82345)
  ]
  constructor() { 
    this.sname="Vishnu";
  }

  ngOnInit(): void {
  }

}
