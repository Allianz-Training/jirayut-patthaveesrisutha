import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Task } from '../task';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {

  @Input()
  task: Task

  @Output()
  onSelected: EventEmitter<TaskComponent> = new EventEmitter();
  @Output()
  onDisplay: EventEmitter<TaskComponent> = new EventEmitter();

  isSelected:boolean = false;
  constructor() { }

  ngOnInit(): void {
  }

  delete(){
    this.onSelected.emit(this)
  }

  select(){
    this.onDisplay.emit(this)
  }
}
