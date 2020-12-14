import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-counting',
  templateUrl: './counting.component.html',
  styleUrls: ['./counting.component.css']
})
export class CountingComponent implements OnInit {

  constructor() { }
  count: number = 0
  ngOnInit(): void {
  }

  incCount() {
    this.count++
  }
}
