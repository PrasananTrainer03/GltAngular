import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-radio-ex',
  templateUrl: './radio-ex.component.html',
  styleUrls: ['./radio-ex.component.css']
})
export class RadioExComponent implements OnInit {

  gender : string;
  constructor() { }

  ngOnInit(): void {
  }

}
