import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { FourthComponent } from './fourth/fourth.component';
import { EventComponent } from './event/event.component';
import { FormsModule } from '@angular/forms';
import { TwoWayComponent } from './two-way/two-way.component';
import { CalcComponent } from './calc/calc.component';
import { NameDemoComponent } from './name-demo/name-demo.component';
import { EmployComponent } from './employ/employ.component';
import { EmployDropDownComponent } from './employ-drop-down/employ-drop-down.component';
import { StudentComponent } from './student/student.component';
import { MenuComponent } from './menu/menu.component';

const appRoutes : Routes = [
  {path:'first',component:FirstComponent},
  {path:'second',component:SecondComponent},
  {path:'third',component:ThirdComponent},
  {path:'fourth',component:FourthComponent},
  {path:'event',component:EventComponent},
  {path:'twoway',component:TwoWayComponent},
  {path:'calc',component:CalcComponent},
  {path:'name',component:NameDemoComponent},
  {path:'employ',component:EmployComponent},
  {path:'employDropDown',component:EmployDropDownComponent},
  {path:'menu',component:MenuComponent},
  {path:'',component:MenuComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    ThirdComponent,
    FourthComponent,
    EventComponent,
    TwoWayComponent,
    CalcComponent,
    NameDemoComponent,
    EmployComponent,
    EmployDropDownComponent,
    StudentComponent,
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
