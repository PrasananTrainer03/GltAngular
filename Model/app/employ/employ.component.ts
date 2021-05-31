import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {

  isValid : boolean = null;
  msg : string;
  employForm = new FormGroup({
    empno: new FormControl('', Validators.required),
    name : new FormControl('',Validators.required),
    dept : new FormControl('',Validators.required),
    desig : new FormControl('',Validators.required),
    basic : new FormControl('',Validators.required)
  });
  onFormSubmit() {
    this.isValid = false;
    if(this.employForm.invalid){
     return;	
    } 	
    this.isValid = true;
    this.msg="Form Submitted Successfully...";
    console.log(this.employForm.valid);

  }

  constructor() { 
    //this.isValid=false;
  }

  ngOnInit(): void {
  }

}
