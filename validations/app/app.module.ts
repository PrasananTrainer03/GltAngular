import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployComponent } from './employ/employ.component';
import { AlphabetOnlyDirectiveDirective } from './employ/alphabet-only-directive.directive';

@NgModule({
  declarations: [
    AppComponent,
    EmployComponent,
    AlphabetOnlyDirectiveDirective
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
