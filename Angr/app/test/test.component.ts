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
  hello(fno : string) {
    this.res=fno;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
