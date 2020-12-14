import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { FormsModule } from '@angular/forms';
import { NavbarComponent } from './navbar/navbar.component';
import { TopBannerComponent } from './top-banner/top-banner.component';
import { CategoryMenuComponent } from './category-menu/category-menu.component';
import { SearchBarComponent } from './search-bar/search-bar.component';
import { CountingComponent } from './counting/counting.component';
import { Lab4ComponentComponent } from './lab4-component/lab4-component.component';
import { TodoListComponent } from './todo-list/todo-list.component';
import { Hw3TopBannerComponent } from './hw3-top-banner/hw3-top-banner.component';
import { Hw3SearchBarComponent } from './hw3-search-bar/hw3-search-bar.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    TopBannerComponent,
    CategoryMenuComponent,
    SearchBarComponent,
    CountingComponent,
    Lab4ComponentComponent,
    TodoListComponent,
    Hw3TopBannerComponent,
    Hw3SearchBarComponent
  ],
  imports: [
    BrowserModule, FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
