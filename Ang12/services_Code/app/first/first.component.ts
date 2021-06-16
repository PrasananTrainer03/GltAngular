import { Component, OnInit } from '@angular/core';
import { DemoService } from '../demo.service';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  show() {
    let result : string;
    result = this._demoService.sayHello();
    alert(result);
  }

  company() {
    let result : string;
    result = this._demoService.company();
    alert(result);
  }

  constructor(private _demoService : DemoService) { }

  ngOnInit(): void {
  }

}
