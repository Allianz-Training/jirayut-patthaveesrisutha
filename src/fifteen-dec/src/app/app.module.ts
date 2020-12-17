import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BackendService } from './backend.service';
import { CatalogModule } from './catalog/catalog.module';
import { HomeModule } from './home/home.module';
import { RoutingModule } from './routing/routing.module';

@NgModule({
  declarations: [
    AppComponent,

  ],
  imports: [
    BrowserModule,
    CatalogModule,
    HomeModule,
    RoutingModule
  ],
  providers: [BackendService],
  bootstrap: [AppComponent]
})
export class AppModule { }
