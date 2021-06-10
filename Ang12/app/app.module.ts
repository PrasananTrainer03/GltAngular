import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { FourthComponent } from './fourth/fourth.component';
import { EventDemoComponent } from './event-demo/event-demo.component';
import { FormsModule } from '@angular/forms';
import { TwoWayComponent } from './two-way/two-way.component';
import { CalcComponent } from './calc/calc.component';
import { ConditionExComponent } from './condition-ex/condition-ex.component';
import { EmployComponent } from './employ/employ.component';
import { EmployDropDownComponent } from './employ-drop-down/employ-drop-down.component';


@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    ThirdComponent,
    TwoWayComponent,
    FourthComponent,
    EventDemoComponent,
    CalcComponent,
    ConditionExComponent,
    EmployComponent,
    EmployDropDownComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
