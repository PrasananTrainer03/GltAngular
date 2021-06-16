import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DemoService {

  sayHello() : string {
    return "Welcome to Angular Programming..";
  }

  company() : string {
    return "GreyLine Technologies...";
  }
  constructor() { }
}
