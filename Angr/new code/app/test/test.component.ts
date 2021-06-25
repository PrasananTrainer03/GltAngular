import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  fno :string;
  sno : string;
  res : string;

  calc() {
    let res : number;
    res = parseInt(this.fno)+parseInt(this.sno);
  //  alert(res);
    let r : string;
    r+=res;
    this.res = r;
  }
  hello(fno : string) {
    let r = parseInt(fno)
   // alert(r);
    let r1 ="";
    r1+=r;
      this.res=r1;
  }

  constructor() { }

  ngOnInit(): void {
  }

}
