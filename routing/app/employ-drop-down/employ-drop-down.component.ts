import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-drop-down',
  templateUrl: './employ-drop-down.component.html',
  styleUrls: ['./employ-drop-down.component.css']
})
export class EmployDropDownComponent implements OnInit {

  ename : string;
  employs = [
    new Employ(1,'Anand','Java','Programmer',53334),
    new Employ(2,'Sai Kiran','Angular','Programmer',94455),
    new Employ(3,'Shiva','Java','Programmer',90334),
    new Employ(4,'Krishna Chandrika','Angular','Programmer',89044),
    new Employ(5,'Mani','Java','Programmer',67755),
    new Employ(6,'Ravali','Java','Programmer',90455),
    new Employ(7,'Rekha','Angular','Programmer',90111),
    new Employ(8,'Srikanth','Sql','Developer',99322),
    new Employ(9,'Venu','Cordova','AppDeveloper',91244),
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
