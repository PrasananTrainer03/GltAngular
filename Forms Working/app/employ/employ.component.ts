import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {

  msg : string;
  employ : Employ;
  isValid : boolean;
  insert(employForm : NgForm) {
    this.isValid=false;
    if (employForm.invalid) {
      return ;
    }
    this.isValid=true;
    this.msg="Form Submitted Successfully...";
  }
  constructor() { 
    this.employ = new Employ();
  }

  ngOnInit(): void {
  }

}
