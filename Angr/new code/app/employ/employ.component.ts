import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {

  employs = [
    new Employ(1,"Ajay","Java","Programmer",82345),
    new Employ(3,"Mutyala Raju","UI","Developer",81344),
    new Employ(4,"Sulthana","Angular","Programmer",92224),
    new Employ(5,"Vishnu","Angular","Programmer",82345)
  ]
  constructor() { }

  ngOnInit(): void {
  }

}
