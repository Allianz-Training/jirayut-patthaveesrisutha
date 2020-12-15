import { AfterViewInit, Component, ViewChild } from '@angular/core';
import { ProductListComponent } from './product-list/product-list.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements AfterViewInit {
  @ViewChild('productList')
  productList: ProductListComponent

  ngAfterViewInit(): void {
    this.productList.products.push({
      name: 'ส้มโอ',
      price: 111
    })
    this.productList.products.push({
      name: 'แตงโม',
      price: 222
    })
    this.productList.products.push({
      name: 'น้ำพร้่าวน้ำหอม',
      price: 333
    })
    // this.productList.products = [
    //   {
    //     name: 'ส้มโอ',
    //     price: 111
    //   },
    //   {
    //     name: 'แตงโม',
    //     price: 222
    //   },
    //   {
    //     name: 'มะพร้่าวน้ำหอม',
    //     price: 333
    //   }
    // ]
  }
}
