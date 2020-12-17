import { Injectable } from '@angular/core';
import { Product } from './product'

@Injectable({
  providedIn: 'root'
})

@Injectable({
  providedIn: 'root'
})
export class BackendService {

  constructor() { }

  getProduct() {
    return [{
      name: 'ส้มโอ',
      price: 111
    }, {
      name: 'แตงโม',
      price: 222
    }, {
      name: 'น้ำพร้่าวน้ำหอม',
      price: 333
    }];
  }

  getProductById(productId: number): Product {
    return;
  }
}
