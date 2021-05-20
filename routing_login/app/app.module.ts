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
import { LoginComponent } from './login/login.component';

const appRoutes : Routes = [
 
 
  {path:'',component:LoginComponent},
  {path:'menu',component:MenuComponent,
  children : [
    {path:'first',component:FirstComponent, outlet:'glt'},
    {path:'second',component:SecondComponent,outlet:'glt'},
    {path:'third',component:ThirdComponent,outlet:'glt'},
    {path:'fourth',component:FourthComponent,outlet:'glt'},
    {path:'event',component:EventComponent,outlet:'glt'},
    {path:'twoway',component:TwoWayComponent,outlet:'glt'},
    {path:'calc',component:CalcComponent,outlet:'glt'},
    {path:'name',component:NameDemoComponent,outlet:'glt'},
    {path:'employ',component:EmployComponent,outlet:'glt'},
    {path:'employDropDown',component:EmployDropDownComponent,outlet:'glt'},
  ]
  },

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
    MenuComponent,
    LoginComponent
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
