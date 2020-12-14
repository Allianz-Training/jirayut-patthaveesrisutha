import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hw3-top-banner',
  templateUrl: './hw3-top-banner.component.html',
  styleUrls: ['./hw3-top-banner.component.css']
})
export class Hw3TopBannerComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  goToLink(url:string){
    window.open(url)
  }

}
