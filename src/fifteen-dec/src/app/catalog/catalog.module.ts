import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductItemComponent } from '../product-item/product-item.component';
import { ProductListComponent } from '../product-list/product-list.component';
import { PanelComponent } from '../panel/panel.component';




@NgModule({
  declarations: [ProductItemComponent,
    ProductListComponent,
    PanelComponent],
  imports: [
    CommonModule
  ],
  exports: [PanelComponent, ProductItemComponent, ProductListComponent]
})
export class CatalogModule { }
