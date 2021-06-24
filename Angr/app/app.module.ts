import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { EventComponent } from './event/event.component';
import { TwoWayComponent } from './two-way/two-way.component';
import { FormsModule } from '@angular/forms';
import { TestComponent } from './test/test.component';
import { ConditionExComponent } from './condition-ex/condition-ex.component';
import { AttendanceDemoComponent } from './attendance-demo/attendance-demo.component';
import { RadioExComponent } from './radio-ex/radio-ex.component';
import { DropDownComponent } from './drop-down/drop-down.component';

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    ThirdComponent,
    EventComponent,
    TwoWayComponent,
    TestComponent,
    ConditionExComponent,
    AttendanceDemoComponent,
    RadioExComponent,
    DropDownComponent
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
