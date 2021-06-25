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
import { SwitchDemoComponent } from './switch-demo/switch-demo.component';
import { LoopExComponent } from './loop-ex/loop-ex.component';
import { EmployComponent } from './employ/employ.component';
import { EmployDropDownComponent } from './employ-drop-down/employ-drop-down.component';
import { MenuComponent } from './menu/menu.component';
import { RouterModule, Routes } from '@angular/router';

const appRoutes : Routes = [
  {path:'first',component:FirstComponent},
  {path:'second',component:SecondComponent},
  {path:'third',component:ThirdComponent},
  {path:'test',component:TestComponent},
  {path:'event',component:EventComponent},
  {path:'attendance',component:AttendanceDemoComponent},
  {path:'condition',component:ConditionExComponent},
  {path:'loop',component:LoopExComponent},
  {path:'employ',component:EmployComponent},
  {path:'employDropDown',component:EmployDropDownComponent},
  {path:'menu',component:MenuComponent},
  {path:'',component:MenuComponent},
]

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
    DropDownComponent,
    SwitchDemoComponent,
    LoopExComponent,
    EmployComponent,
    EmployDropDownComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(appRoutes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
