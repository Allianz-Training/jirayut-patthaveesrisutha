import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent implements OnInit {

  @Input()
  item:string

  delItem:string
  constructor() { }
  list = ['Coffee', 'Breakfast']
  ngOnInit(): void {
  }

  addItem(){
    this.list.push(this.item)
  }

  deleteItem(delItem:string){
    this.list = this.list.filter(item => item != delItem)
  }

}
