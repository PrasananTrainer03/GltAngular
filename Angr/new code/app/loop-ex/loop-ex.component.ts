import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-loop-ex',
  templateUrl: './loop-ex.component.html',
  styleUrls: ['./loop-ex.component.css']
})
export class LoopExComponent implements OnInit {

  names = ["Aiay","Mutyala Raju","Manikanta","Manoj","Sulthana","Vishnu Vardhan"];
  constructor() { }

  ngOnInit(): void {
  }

}
