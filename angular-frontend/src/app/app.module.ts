import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {TripListComponent} from './components/trip-list/trip-list.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatCardModule} from "@angular/material/card";
import {HttpClientModule} from "@angular/common/http";
import {MatButtonModule} from "@angular/material/button";
import {HeaderComponent} from './components/header/header.component';
import {NavigationComponent} from './components/navigation/navigation.component';
import {MatButtonToggleModule} from "@angular/material/button-toggle";
import {AboutusComponent} from './components/aboutus/aboutus.component';
import {HomeComponent} from './components/home/home.component';
import {RouterModule} from "@angular/router";

@NgModule({
  declarations: [
    AppComponent,
    TripListComponent,
    HeaderComponent,
    NavigationComponent,
    AboutusComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatCardModule,
    MatButtonModule,
    MatButtonToggleModule,
    RouterModule.forRoot([
      { path: '', component: HomeComponent}, // default
      { path: 'home', component: HomeComponent},
      { path: 'about-us', component: AboutusComponent},
      { path: 'all-trips', component: TripListComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
